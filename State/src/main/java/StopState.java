/**
 * @Author: srf
 * @Date: 2023/12/27 17:02
 * @description:
 */
public class StopState  implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("播放器处于停止状态");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "停止状态";
    }

}
