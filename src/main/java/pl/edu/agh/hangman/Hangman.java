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

            String wordToFind = randomizer.random();


            ui.displayCurrentState(HANGMANPICS, iterator);

            ui.displayHiddenWord(wordToFind);

            boolean letterGood;

            for (int i=0; i < HANGMANPICS.length; i++) {

                String word = inputLetter.getChar();


                letterGood = checkLetter(word, wordToFind);
            }






        ui.displayHiddenWord("Ala Ma Kota");



        }
    }
}
