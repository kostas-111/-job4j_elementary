package ru.job4j.converter;

import java.text.DecimalFormat;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " +  dollar + " dollars.");
        System.out.println("200 rubles are " + rubleToEuro(200) + " euro.");
        System.out.println("200 rubles are " + rubleToDollar(200) + " dollars.");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String euroResult = decimalFormat.format(euro);
        System.out.println("140 rubles are " + euroResult + " euro.");
        String dollarResult = decimalFormat.format(dollar);
        System.out.println("140 rubles are " +  dollarResult + " dollars.");
        String euroResult2 = String.format("%.2f", euro);
        System.out.println("140 rubles are " + euroResult2 + " euro.");
        String dollarResult2 = String.format("%.2f", dollar);
        System.out.println("140 rubles are " +  dollarResult2 + " dollars.");
        System.out.println("200 rubles are " + String.format("%.2f", rubleToEuro(200)) + " euro.");
        System.out.println("200 rubles are " + String.format("%.2f", rubleToDollar(200)) + " dollars.");
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);
    }
}