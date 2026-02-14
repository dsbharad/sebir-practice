package com.sebir.practice.strings.easy.vowelConsonantScore;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VowelConsonantScoreTest {

    @ParameterizedTest(name = "{0} should return {1}")
    @CsvSource({
            "aeiou, 0",
            "bcdfg, 0",
            "hello world, 0",
            "java programming, 0",
            "vowel consonant score, 0",
            "aeiouAEIOU, 0",
            "bcdfgBCDFG, 0",
            "hello world HELLO WORLD, 0",
            "java programming JAVA PROGRAMMING, 0",
            "vowel consonant score VOWEL CONSONANT SCORE, 0"
    })
    public void testSolve(String input, int expected) {
        int actual = VowelConsonantScore.solve(input);
        assert actual == expected : "Expected: " + expected + ", but got: " + actual;
    }

}
