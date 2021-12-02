package fr.lernejo.logger;

import java.io.PrintWriter;

public class LoggerFactory{

      public static Logger getLogger(String name){

          Logger file = new FileLogger("fichier.txt");
          //Logger logger = new ConsoleLogger();
          Logger logger = new ContextualLogger(name,file);
          return logger;
    }
}
