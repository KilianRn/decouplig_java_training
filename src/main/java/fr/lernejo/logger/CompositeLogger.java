package fr.lernejo.logger;

public class CompositeLogger implements Logger{
Logger log1;
Logger log2;

    public CompositeLogger(Logger logger1, Logger logger2){
        this.log1 = logger1;
        this.log2 = logger2;
    }
    @Override
    public void log(String message) {
        log1.log(message);
        log2.log(message);
    }
}
