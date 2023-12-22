/**
 * @Author: srf
 * @Date: 2023/12/22 14:27
 * @description:
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        // 形成责任链
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "这是一条信息级别的消息。");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "这是一条调试级别的消息。");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "这是一条错误级别的消息。");
    }

}
