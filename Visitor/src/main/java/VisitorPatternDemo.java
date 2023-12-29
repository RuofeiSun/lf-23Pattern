/**
 * @Author: srf
 * @Date: 2023/12/29 11:01
 * @description:
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
