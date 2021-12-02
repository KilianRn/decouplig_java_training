package fr.lernejo.logger;

import java.io.PrintWriter;

public class LoggerFactory{

      public static Logger getLogger(String name){

          //Logger file = new FileLogger("fichier.txt");
          //Logger logger = new ConsoleLogger();
          //Logger logger0 = new CompositeLogger(new ConsoleLogger(), new ContextualLogger(name, new FilteredLogger(new FileLogger("fichier.txt"),message->message.contains("simulation") )));
          //Logger logger1 = new ContextualLogger(name, logger0);
          //Logger logger2 = new FilteredLogger(logger1, message->message.contains("simulation"));
          Logger logger0 = new ContextualLogger(name, new CompositeLogger(new ConsoleLogger(),new FilteredLogger(new FileLogger("fichier.txt"),message->message.contains("simulation") )));
          return logger0;
    }
}
