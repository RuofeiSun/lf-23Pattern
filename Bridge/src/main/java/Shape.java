/**
 * @Author: srf
 * @Date: 2023/12/1 15:03
 * @description:
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
