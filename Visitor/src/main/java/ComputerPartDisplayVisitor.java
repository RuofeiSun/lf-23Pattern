/**
 * @Author: srf
 * @Date: 2023/12/29 11:01
 * @description:
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    @Override
    public void visit(Computer computer) {
        System.out.println("展示电脑。");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("展示鼠标。");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("展示键盘。");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("展示显示器。");
    }

}
