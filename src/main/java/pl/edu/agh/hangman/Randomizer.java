package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class Randomizer {

    private List<String> words;


    public Randomizer(List<String> words) {
        this.words = words;
    }

    public String random() {
        Random random = new Random();
        return words.get(random.nextInt(words.size() - 1));
    }
}
