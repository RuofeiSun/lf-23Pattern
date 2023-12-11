/**
 * @Author: srf
 * @Date: 2023/12/6 11:07
 * @description:
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("带有普通边框的圆形");
        circle.draw();

        System.out.println("\n带有红色边框的圆形");
        redCircle.draw();

        System.out.println("\n带有红色边框的矩形");
        redRectangle.draw();
    }

}
