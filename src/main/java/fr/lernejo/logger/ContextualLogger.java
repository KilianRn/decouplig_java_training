package fr.lernejo.logger;

import fr.lernejo.guessgame.HumanPlayer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{
public String name;
public Logger log;

    public ContextualLogger(String name_class, Logger logger){
        this.name = name_class;
        this.log = logger;
    }
    @Override
    public void log(String message) {
        log.log(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")) + " " + name + " " + message);
    }
}
