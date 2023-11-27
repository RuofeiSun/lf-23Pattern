package Lazy;

/**
 * @Author: srf
 * @Date: 2023/11/27 16:30
 * @description:懒汉式单例
 */
public class A {
    private static A obj;

    private A() {} // 私有构造函数

    public static synchronized A getA() {
        if (obj == null) {
            obj = new A(); // 第一次调用时创建实例
        }
        return obj;
    }

    public void doSomething() {
        // 方法实现
    }
}
