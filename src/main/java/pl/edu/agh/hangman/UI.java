package pl.edu.agh.hangman;

public class UI {

    public void displayWord(String word){
            System.out.println(word);
    }

    public void displayInviteMessage(String message){
        System.out.println(message);
    }

    public int displayCurrentState(String[] stateString, int currentState){
        System.out.println(stateString[currentState]);
        return currentState+1;
    }

    public boolean endGame(String[] word, int currentState){
        if (word.length-2< currentState){
            return true;
        }
        return false;
    }

}
