package com.greedy.level2.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static String randomUpperAlphabet(int length) {
        String randomStr = "";
        for (int i = 0; i < length; i++){
            randomStr += (char) ((int) (Math.random() * 25) + 65);
        }

        return randomStr;
    }

    public static String rockPaperScissors() {
        String[] games = {"가위", "바위", "보"};

        Random rand = new Random();
        int randNum = rand.nextInt(3);

        return games[randNum];
    }

    public static String tossCoin() {
        String[] coin = {"앞면", "뒷면"};
        Random rand = new Random();
        int randNum = rand.nextInt(2);

        return coin[randNum];
    }
}
