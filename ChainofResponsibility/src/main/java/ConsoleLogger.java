/**
 * @Author: srf
 * @Date: 2023/12/22 14:25
 * @description:
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("标准控制台::Logger: " + message);
    }

}
