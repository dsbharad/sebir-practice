package com.sebir.practice.strings.easy.vowelConsonantScore;

import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VowelConsonantScore {

    private static final Logger logger = LoggerFactory.getLogger(VowelConsonantScore.class);

    public static int solve(String input) {
        Map<Boolean, Long> counts = input.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c >= 'a' && c <= 'z')
                .collect(Collectors.partitioningBy(c -> "aeiou".indexOf(c) != -1, Collectors.counting()));

        long vowelCount = counts.get(true);
        long consonantCount = counts.get(false);

        return (consonantCount > 0) ? (int) Math.floor(vowelCount / consonantCount) : 0;
    }

}
