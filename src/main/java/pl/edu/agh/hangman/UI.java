package pl.edu.agh.hangman;

public class UI {

    public void displayHiddenWord(String word){
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            System.out.print("_");
        }
    }

    public void displayInviteMessage(String message){
        System.out.println(message);
    }

    public int displayCurrentState(String[] stateString, int currentState){
        System.out.println(stateString[currentState]);
        return currentState+1;
    }

    public boolean endGame(String word, int currentState){
        if (word.length()== currentState){
            return true;
        }
        return false;
    }

}
