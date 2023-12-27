/**
 * @Author: srf
 * @Date: 2023/12/27 16:17
 * @description:
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("第一次状态改变: 15");
        subject.setState(15);
        System.out.println("第二次状态改变: 10");
        subject.setState(10);
    }

}
