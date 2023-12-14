/**
 * @Author: srf
 * @Date: 2023/12/13 16:19
 * @description:
 */
public class Circle implements Shape{

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("圆形: Draw() [颜色 : " + color + ", x : " + x + ", y :" + y + ", 半径 :" + radius);
    }

}
