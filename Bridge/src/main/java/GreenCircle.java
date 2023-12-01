/**
 * @Author: srf
 * @Date: 2023/12/1 15:02
 * @description:
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("绘制圆形[ 颜色: 绿色, 半径: " + radius + ", x: " + x + ", y: " + y + "]");
    }

}
