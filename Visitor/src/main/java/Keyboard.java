/**
 * @Author: srf
 * @Date: 2023/12/29 10:58
 * @description:
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
