package fr.lernejo.guessgame;
import java.util.Date;
import java.util.Scanner;

import java.security.SecureRandom;

public class Launcher {

    private static Long Number;
    private static Long param;
    private static Integer param1;

    public static void main(String args[]){

        if(args.length == 0){
            System.out.println("args[0] : -interactive OU -auto ET args[1] : nombre_de_votre_choix");
        }
        if(args[0].equals("-interactive")){
            param=Long.MAX_VALUE;
        Simulation simulation = new Simulation(new HumanPlayer());
        SecureRandom random = new SecureRandom();
        long Number = random.nextInt(100);
        simulation.initialize(Number, param);
        Date uDate = new java.util.Date (System.currentTimeMillis ()); //Relever l'heure avant le debut du progamme (en milliseconde)
        simulation.loopUntilPlayerSucceed();
        Date dateFin = new Date (System.currentTimeMillis()); //Relever l'heure a la fin du progamme (en milliseconde)
        Date duree = new Date (System.currentTimeMillis()); //Pour calculer la différence
        duree.setTime (dateFin.getTime () - uDate.getTime ());  //Calcul de la différence
        long secondes = duree.getTime () / 1000;
        long min = secondes / 60;
        long mili = duree.getTime () % 1000;
        secondes %= 60;
        System.out.println (min + ":" + secondes + "." + mili + "\n");
        }
        if(args[0].equals("-auto") && args[1].matches("[+-]?\\d*(\\.\\d+)?")){
            param1=1000;
            Number = Long.valueOf(args[1]);
            Simulation simulation = new Simulation(new ComputerPlayer());
            simulation.initialize(Number, param1);
            Date uDate = new java.util.Date (System.currentTimeMillis ()); //Relever l'heure avant le debut du progamme (en milliseconde)
            simulation.loopUntilPlayerSucceed();
            Date dateFin = new Date (System.currentTimeMillis()); //Relever l'heure a la fin du progamme (en milliseconde)
            Date duree = new Date (System.currentTimeMillis()); //Pour calculer la différence
            duree.setTime (dateFin.getTime () - uDate.getTime ());  //Calcul de la différence
            long secondes = duree.getTime () / 1000;
            long min = secondes / 60;
            long mili = duree.getTime () % 1000;
            secondes %= 60;
            System.out.println (min + ":" + secondes + "." + mili + "\n");
        }

    }
}
