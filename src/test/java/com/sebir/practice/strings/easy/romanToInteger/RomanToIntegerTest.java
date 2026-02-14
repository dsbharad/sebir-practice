package com.sebir.practice.strings.easy.romanToInteger;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanToIntegerTest {

    @ParameterizedTest(name = "should return {1} when input is {0}")
    @CsvSource({
        "I, 1",
        "III, 3",
        "IV, 4",
        "V, 5",
        "VI, 6",
        "IX, 9",
        "X, 10",
        "XL, 40",
        "LVIII, 58",
        "MCMXCIV, 1994",
        "iv, 4",
        "'', 0",
        "MDCCCLXXXVIII, 1888",
        "MMMDCCCLXXXVIII, 3888"
    })
    void solve(String input, int expected) {
        assertThat(RomanToInteger.solve(input)).isEqualTo(expected);
    }
}
