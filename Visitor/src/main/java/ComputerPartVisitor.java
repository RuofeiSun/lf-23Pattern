/**
 * @Author: srf
 * @Date: 2023/12/29 11:00
 * @description:
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);

}
