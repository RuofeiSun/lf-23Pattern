import java.util.ArrayList;
import java.util.List;

/**
 * @Author: srf
 * @Date: 2023/12/27 11:35
 * @description:
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
