package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        char symbol = input.charAt(0);
        String result = "";
        int counter = 1;
            for (int i = 1; i < input.length(); i++) {
                if (symbol == input.charAt(i)) {
                    counter++;
                } else if (counter == 1) {
                    result += Character.toString(symbol);
                    symbol = input.charAt(i);
                } else {
                    result += Character.toString(symbol) + counter;
                    symbol = input.charAt(i);
                    counter = 1;
                }
            }
        if (counter == 1) {
            return result + symbol;
        } else {
            return result + symbol + counter;
        }
    }
}