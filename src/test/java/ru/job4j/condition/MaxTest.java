package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3Or1Or4Then4() {
        int a = 3;
        int b = 1;
        int c = 4;
        int result = Max.max(a, b, c);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3Or0OrMinus4Then3() {
        int a = 3;
        int b = 0;
        int c = -4;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMaxMinus3Or0OrMinus4Then3() {
        int a = -3;
        int b = 0;
        int c = -4;
        int result = Max.max(a, b, c);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3Or3Or3Then3() {
        int a = 3;
        int b = 3;
        int c = 3;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3Or1Or4Or5Then5() {
        int a = 3;
        int b = 1;
        int c = 4;
        int d = 5;
        int result = Max.max(a, b, c, d);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3Or1Or6Or5Then6() {
        int a = 3;
        int b = 1;
        int c = 6;
        int d = 5;
        int result = Max.max(a, b, c, d);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3Or7Or6OrMinus5Then6() {
        int a = 3;
        int b = 7;
        int c = 6;
        int d = -5;
        int result = Max.max(a, b, c, d);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8Or1Or0Or0Then6() {
        int a = 8;
        int b = 1;
        int c = 0;
        int d = 3;
        int result = Max.max(a, b, c, d);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1Or1Or1Or1Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}