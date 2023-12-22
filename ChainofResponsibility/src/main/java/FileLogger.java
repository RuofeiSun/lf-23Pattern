/**
 * @Author: srf
 * @Date: 2023/12/22 14:26
 * @description:
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("文件::Logger: " + message);
    }

}
