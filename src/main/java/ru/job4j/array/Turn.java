package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int amount;
        if (array.length % 2 == 0) {
            amount = array.length / 2;
        } else {
            amount = (array.length - 1) / 2;
        }
        for (int i = 0; i < amount; i++) {
                int temp = array[i];
                array[i] = array[(array.length - 1) - i];
                array[(array.length - 1) - i] = temp;
        }
        return array;
    }
}