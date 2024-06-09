package DesignPattern.BehavioralPattern.ChainOfResponsibility;

public class LoggerService {

    private final Logger loggerChain;

    public LoggerService(Logger loggerChain) {
        this.loggerChain = loggerChain;
    }

    public void logMessage(int level, String message) {
        loggerChain.logMessage(level, message);
    }

}
