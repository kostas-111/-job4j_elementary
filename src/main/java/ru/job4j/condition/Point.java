package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double x2MinusX1 = x2 - x1;
        double y2MinusY1 = y2 - y1;
        double xPow = Math.pow(x2MinusX1, 2);
        double yPow = Math.pow(y2MinusY1, 2);
        double xPowPlusYPow = xPow + yPow;
        double result = Math.sqrt(xPowPlusYPow);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(5, 1, 9, 60);
        System.out.println("result (5, 1) to (9, 60): " + String.format("%.3f", result));
    }
}
