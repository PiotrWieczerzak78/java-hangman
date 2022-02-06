package pl.edu.agh.hangman;

import java.util.Scanner;

public class InputLetter {
    public String getChar() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter = input.nextLine();
        System.out.println(letter);
        return letter;



    }




}
