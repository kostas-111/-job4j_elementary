package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish0Then0() {
        int start = 10;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1Then1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus2Finish3Then3() {
        int start = -2;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus10FinishMinus8ThenMinus27() {
        int start = -10;
        int finish = -8;
        int result = Counter.sum(start, finish);
        int expected = -27;
        assertThat(result).isEqualTo(expected);
    }
}