/**
 * @Author: srf
 * @Date: 2023/12/27 11:35
 * @description:
 */
public class MementoPatternDemo {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("当前状态: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一次保存的状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次保存的状态: " + originator.getState());
    }

}
