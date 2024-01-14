package ru.job4j.condition;

public class TriangleArea {

    public static double area(double a, double b, double c) {
        double semiPerimetr = (a + b + c) / 2;
        double result = Math.sqrt(semiPerimetr * (semiPerimetr - a) * (semiPerimetr - b) * (semiPerimetr - c));
        return result;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
