package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenX5Y1ToX9Y60Then59Dot14() {
        double expected = 59.14;
        int x1 = 5;
        int y1 = 1;
        int x2 = 9;
        int y2 = 60;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void whenXMinus6Y0ToX34Y0Then40() {
        double expected = 40;
        int x1 = -6;
        int y1 = 0;
        int x2 = 34;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX0Y0ToX765YMinus999Then1258Dot263() {
        double expected = 1258.263;
        int x1 = 0;
        int y1 = 0;
        int x2 = 765;
        int y2 = -999;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}