/**
 * @Author: srf
 * @Date: 2023/12/22 14:25
 * @description:
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误控制台::Logger: " + message);
    }
}
