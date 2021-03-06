package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player{

    Logger logger = new LoggerFactory().getLogger("player");
    Scanner sc = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        System.out.println("entrez un nombre :");
        return sc.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater==true){
            logger.log("le nombre à trouver est plus grand");
        }
        else{
            logger.log("le nombre à trouver est plus petit");
        }
    }

}
