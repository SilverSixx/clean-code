package DesignPattern.BehavioralPattern.ChainOfResponsibility;

public class LoggerConfig {

    public Logger getLoggerChain() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger infoLogger = new InfoLogger(Logger.INFO);
        Logger debugLogger = new DebugLogger(Logger.DEBUG);

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        return errorLogger;
    }

}
