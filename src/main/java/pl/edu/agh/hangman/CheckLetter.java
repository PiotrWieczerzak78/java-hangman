package pl.edu.agh.hangman;

import java.util.Scanner;

public class CheckLetter {
    String wordToFind;

    public void setWordToFind(String wordToFind) {
        this.wordToFind = wordToFind;
    }
    public String getWordToFind() {
        return wordToFind;
    }

    public boolean CheckLetters(String inputLetter) {

        for (int i = 0; i < wordToFind.length(); i++) {
            System.out.println("");
            if(wordToFind.charAt(i) == '_'){
                if (wordToFind.charAt(i) == inputLetter.charAt(0)){
            }

        }


    }
}

