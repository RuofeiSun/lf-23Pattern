/**
 * @Author: srf
 * @Date: 2023/12/14 20:42
 * @description:
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图片将从磁盘加载
        image.display();
        System.out.println("");

        // 图片不会从磁盘重新加载
        image.display();
    }

}
