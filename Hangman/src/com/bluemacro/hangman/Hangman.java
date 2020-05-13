package com.bluemacro.hangman;

import com.bluemacro.hangman.CategorySelector;

public class Hangman {

    protected static String emptyString =
            new String(new char[CategorySelector.word.length()]).replace("\0", "_");
    protected static int count = 0;

    public static void guessWords(String guess) {
        String newEmptyString = "";
        for (int i = 0; i < CategorySelector.word.length(); i++) {
            if (CategorySelector.word.charAt(i) == guess.charAt(0)) {
                newEmptyString += guess.charAt(0);
            } else if (emptyString.charAt(i) != '_') {
                newEmptyString += CategorySelector.word.charAt(i);
            } else {
                newEmptyString += "_";
            }
        }

        if (emptyString.equals(newEmptyString)) {
            count++;
            paintHangman();
        } else {
            emptyString = newEmptyString;
        }
        if (emptyString.equals(CategorySelector.word)) {
            System.out.println("Correct! You win! The word was " + CategorySelector.word);
        }
    }

    public static void paintHangman() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("1 incorrect guess, 6 guesses left");
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |            |");
            System.out.println("    |            |");
            System.out.println("    |            |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("2 incorrect guesses, 5 guesses left");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|");
            System.out.println("    |         /  |");
            System.out.println("    |        /   |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("3 incorrect guesses, 4 guesses left");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("4 incorrect guesses, 3 guesses left");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |           /");
            System.out.println("    |          /");
            System.out.println("    |        _/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("5 incorrect guesses, 2 guesses left");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  < ' |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |           / \\");
            System.out.println("    |          /   \\");
            System.out.println("    |        _/     \\_");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("6 incorrect guesses, only 1 guess left!");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("7 incorrect guesses");
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / X X \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  __  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |           / \\");
            System.out.println("    |          /   \\");
            System.out.println("    |        _/     \\_");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("RIP " + UserName.getUserName());
            System.out.println("GAME OVER! The word was " + CategorySelector.word);
        }
    }
}

