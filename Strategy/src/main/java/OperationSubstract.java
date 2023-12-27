/**
 * @Author: srf
 * @Date: 2023/12/27 17:41
 * @description:
 */
public class OperationSubstract implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }

}
