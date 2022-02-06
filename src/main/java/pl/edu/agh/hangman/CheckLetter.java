package pl.edu.agh.hangman;

import java.util.Scanner;

public class CheckLetter {
    private String wordToFind;
    private String wordHidden;

    public String getWordHidden() {
        return wordHidden;
    }

    public void setWordHidden(String wordHidden) {
        this.wordHidden = wordHidden;
    }

    public void setWordToFind(String wordToFind) {
        this.wordToFind = wordToFind;
    }
    public String getWordToFind() {
        return wordToFind;
    }

    public boolean checkLetters(String inputLetter) {
        String tempString = getWordHidden();
        String newString ="";

        boolean found = false;

        for (int i = 0; i < wordToFind.length(); i++) {
            if(tempString.charAt(i) == '_'){
                if (wordToFind.charAt(i) == inputLetter.charAt(0)){
                    newString=newString+ inputLetter.charAt(0);
                    found=true;
                }else{
                    newString=newString+tempString.charAt(i);
                }
            }else{
                newString=newString+tempString.charAt(i);
            }
        }
        this.wordHidden = newString;
        return found;
    }

    public String hideWord(String word){
        String hiddenWord="";
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i++) {
            hiddenWord=hiddenWord+'_';
        }
        return hiddenWord;
    }

    public boolean checkFoundWord(){
        return this.wordHidden.contains("_");
    }
}

