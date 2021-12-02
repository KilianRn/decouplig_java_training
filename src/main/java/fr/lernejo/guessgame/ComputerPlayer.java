package fr.lernejo.guessgame;

public class ComputerPlayer implements Player {

    public Long borneG = Long.MIN_VALUE;
    public Long borneD = Long.MAX_VALUE;
    public Long result;

    @Override
    public long askNextGuess() {
        result = ((borneG + borneD)/2);
        return result;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

        if(lowerOrGreater==true){
            borneG = result;
        }
        else{
            borneD= result;
        }
        result = ((borneG + borneD)/2);
    }
}
