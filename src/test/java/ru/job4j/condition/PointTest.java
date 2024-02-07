package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenX5Y1ToX9Y60Then59Dot14() {
        Point a = new Point(5, 1);
        Point b = new Point(9, 60);
        double expected = 59.14;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenXMinus6Y0ToX34Y0Then40() {
        Point a = new Point(-6, 0);
        Point b = new Point(34, 0);
        double expected = 40;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX0Y0ToX765YMinus999Then1258Dot263() {
        Point a = new Point(0, 0);
        Point b = new Point(765, -999);
        double expected = 1258.263;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenXMinus6Y0Z10ToX34Y0Z5Then40() {
        Point a = new Point(-6, 0, 10);
        Point b = new Point(34, 7, 5);
        double expected = 40.915;
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}