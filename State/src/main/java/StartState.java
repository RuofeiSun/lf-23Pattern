/**
 * @Author: srf
 * @Date: 2023/12/27 17:01
 * @description:
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("播放器处于开始状态");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "开始状态";
    }

}
