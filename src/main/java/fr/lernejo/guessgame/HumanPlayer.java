package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class HumanPlayer implements Player{

    Logger logger = new LoggerFactory().getLogger("player");
    Scanner sc = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        return sc.nextLong();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater==true){
            System.out.println("le nombre à trouver est plus grand");
        }
        else{
            System.out.println("le nombre à trouver est plus petit");
        }
    }

}
