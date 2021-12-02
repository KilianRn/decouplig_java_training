package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private Long numberToGuess; //TODO add variable typ
    private Long iteration;

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess, long iteration) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
        this.iteration = iteration;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me

        long result;
        result = player.askNextGuess();

        if(numberToGuess.equals(result)){
            logger.log("le nombre est le bon, vous avez gagné bravo ! : " + numberToGuess);
            return true;
        }
        else if(numberToGuess < result){
            //logger.log("le nombre saisi est supérieur");
            //logger.log(" result : " + String.valueOf(result) + " nb a trouver " +  String.valueOf(numberToGuess));
            player.respond(false);
            return false;
        }
        else {
            //logger.log("le nombre saisi est inférieur");
            player.respond(true);
            return false;
        }
    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        long i=0;
        while(nextRound() != true && i <= iteration){
            //logger.log("iter : " + String.valueOf(i));
            i++;
        }
        System.out.println("iteration : " + i);
    }
}
