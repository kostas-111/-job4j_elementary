package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert200RblThen2dot8571Euro() {
        float input = 200;
        float expected = 2.8571f;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert200RblThen3dot3333Dollar() {
        float input = 200;
        float expected = 3.3333f;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void  whenConvert0RblThen0Dollar() {
        float input = 0;
        float expected = 0;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}