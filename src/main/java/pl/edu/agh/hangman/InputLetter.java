package pl.edu.agh.hangman;

import java.util.Scanner;

public class InputLetter {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter = input.nextLine();
        System.out.println(letter);
        if(letter.length() > 1);
        System.out.println("please put only one letter");


    }


}
