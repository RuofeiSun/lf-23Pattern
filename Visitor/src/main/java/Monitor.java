/**
 * @Author: srf
 * @Date: 2023/12/29 10:59
 * @description:
 */
public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

}
