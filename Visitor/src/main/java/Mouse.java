/**
 * @Author: srf
 * @Date: 2023/12/29 10:59
 * @description:
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
