package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        String result = "";
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
              result = counter == 1 ? result + symbol : result + symbol + counter;
              symbol = input.charAt(i);
              counter = 1;
            }
        }
        return counter == 1 ? result + symbol : result + symbol + counter;
    }
}