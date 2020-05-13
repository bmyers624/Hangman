package com.bluemacro.hangman;

import java.util.Scanner;

import static com.bluemacro.hangman.CategoryType.*;

public class CategorySelector {
    private static String[] sportWords = {"football", "baseball", "soccer", "tennis", "basketball"};
    private static String[] foodWords = {"pizza", "burger", "ramen", "sandwich", "burrito"};
    private static String[] animalWords = {"cat", "dog", "fish", "bird", "monkey"};
    public static String word;

    public static void pickCategory() {
        Scanner s = new Scanner(System.in);
        System.out.print("Hello " + UserName.getUserName() + "! Pick a category. Your categories are:"
                + java.util.Arrays.asList(values()));
        System.out.println("");
        String categoryStr = s.nextLine();
        // convert String to enum - CATEGORYTYPE
        CategoryType category = valueOf(categoryStr.toUpperCase());

        switch (category) {
            case SPORTS:
                word = randomWord(sportWords);
                break;
            case FOOD:
                word = randomWord(foodWords);
                break;
            case ANIMALS:
                word = randomWord(animalWords);
                break;
        }

    }

    public static String randomWord(String[] array) {

        int position = (int)(Math.random() * array.length);
        String result = array[position];
        return result;
    }

    }


