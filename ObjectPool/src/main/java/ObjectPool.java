import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: srf
 * @Date: 2023/11/30 16:47
 * @description:
 */
public abstract class ObjectPool<T> {

    private long expirationTime;
    private ConcurrentHashMap<T, Long> locked, unlocked;

    public ObjectPool() {
        expirationTime = 30000; // 30 秒
        locked = new ConcurrentHashMap<T, Long>();
        unlocked = new ConcurrentHashMap<T, Long>();
    }

    protected abstract T create();
    public abstract boolean validate(T o);
    public abstract void expire(T o);

    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) {
                    // 对象已过期
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return t;
                    } else {
                        // 对象验证失败
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        // 无可用对象，创建一个新的
        t = create();
        locked.put(t, now);
        return t;
    }

    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }

}
