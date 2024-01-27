package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then2() {
        int[] data = new int[] {30, 12, 5, 22, 9};
        int element = 5;
        int expected = 2;
        int result = FindLoop.indexOf(data, element);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {9, 2, 4, 5, 6};
        int element = 10;
        int expected = -1;
        int result = FindLoop.indexOf(data, element);
        assertThat(result).isEqualTo(expected);
    }
}