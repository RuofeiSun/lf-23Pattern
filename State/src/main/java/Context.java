/**
 * @Author: srf
 * @Date: 2023/12/27 17:05
 * @description:
 */
public class Context {

    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

}
