package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger{
    Logger log;
    Predicate<String> cond;
    public FilteredLogger(Logger delegate, Predicate<String> condition) {
        //TODO assign arguments to fields
        this.log = delegate;
        this.cond = condition;
    }
    @Override
    public void log(String message) {
            if(cond.test(message)){
                log.log(message);
            }
    }
}
