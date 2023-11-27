package Early;

/**
 * @Author: srf
 * @Date: 2023/11/27 16:29
 * @description:饿汉式单例
 */
public class A {

    private static A obj = new A(); // 类加载时即创建实例

    private A() {} // 私有构造函数

    public static A getA() {
        return obj;
    }

    public void doSomething() {
        // 方法实现
    }

}
