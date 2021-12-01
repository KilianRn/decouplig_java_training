package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private Long numberToGuess; //TODO add variable typ

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me

        long result;
        System.out.println("entrez un nombre :");
        result = player.askNextGuess();

        if(numberToGuess.equals(result)){
            logger.log("le nombre est le bon");
            return true;
        }
        else if(numberToGuess < result){
            logger.log("le nombre saisi est supérieur");
            player.respond(false);
            return false;
        }
        else {
            logger.log("le nombre saisi est inférieur");
            player.respond(true);
            return false;
        }
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        while(nextRound() != true){

        }
    }
}
