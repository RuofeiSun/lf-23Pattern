import java.util.HashMap;

/**
 * @Author: srf
 * @Date: 2023/12/13 16:20
 * @description:
 */
public class ShapeFactory {

    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("创建颜色为 " + color + " 的圆形");
        }
        return circle;
    }

}
