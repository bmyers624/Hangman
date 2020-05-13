package com.bluemacro.hangman;

import com.bluemacro.hangman.CategorySelector;

import java.util.Scanner;

public class GameEngine {
    public static void RunGame() {
        UserName.setUserName();
        CategorySelector.pickCategory();
        Scanner sc = new Scanner(System.in);


        while (Hangman.count < 7 && Hangman.emptyString.contains("_")) {

            System.out.println("Guess any letter in the word");
            System.out.println(Hangman.emptyString);
            String guess = sc.next();
            Hangman.guessWords(guess);
        }

            sc.close();
    }
}

