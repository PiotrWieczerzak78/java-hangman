package pl.edu.agh.hangman;

import java.io.IOException;
import java.util.ArrayList;

public class Hangman {

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        UI ui = new UI();
        InputLetter inputLetter = new InputLetter();
        CheckLetter   checkLetter = new CheckLetter();
        String filePath = "src/main/resources/slowa.txt";
        ArrayList<String> allWords = new ArrayList<>();

        allWords = readFile.fileReader(filePath);

        Randomizer randomizer = new Randomizer(allWords);

        boolean endOfGame = false;
        int iterator = 0;


        while (!endOfGame) {

            String wordToFind = randomizer.random().toUpperCase();
            ui.displayCurrentState(HANGMANPICS, iterator);
            ui.displayWord(wordToFind);
            checkLetter.setWordToFind(wordToFind);
            String hiddenWord = checkLetter.hideWord(wordToFind);
            ui.displayWord(hiddenWord);
            checkLetter.setWordHidden(hiddenWord);
            boolean letterGood;
            boolean endParty = false;
            int itemCounter=0;
            while (!endParty) {
                String word = inputLetter.getChar().toUpperCase();

                letterGood = checkLetter.checkLetters(word);
                if (!letterGood) {
                    itemCounter++;
                }
                    ui.displayCurrentState(HANGMANPICS, itemCounter);
                    ui.displayWord(checkLetter.getWordHidden());
                if (!checkLetter.checkFoundWord()){
                    ui.displayInviteMessage("you won");
                    endParty=true;
                }
                if(ui.endGame(HANGMANPICS, itemCounter)){
                    ui.displayInviteMessage("you lost");
                    endParty=true;
                }
            }

            endOfGame = true;
        }
    }
}
