package com.sebir.practice.strings.easy.romanToInteger;

import org.slf4j.Logger;

public class RomanToInteger {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(RomanToInteger.class);

    public static Integer solve(String input) {
        Integer result = 0;
        char current;
        int currentValue, previousValue;
        for (int index = input.length() - 1; index >= 0; index--) {
            current = input.charAt(index);
            currentValue = getValue(current);
            previousValue = index > 0 ? getValue(input.charAt(index - 1)) : 0;            
            if (currentValue > previousValue) {
                result += currentValue - previousValue;
                index--;
            } else {
                result += currentValue;
            }
            logger.debug("\n Current: {}, Previous: {}, Current Value: {}, Previous Value: {}, Result: {}", current, index > 0 ? input.charAt(index - 1) : ' ', currentValue, previousValue, result);
        }
        return result;
    }
    
    private static int getValue(char c) {
        return switch (c) {
            case 'I', 'i' -> 1;
            case 'V', 'v' -> 5;
            case 'X', 'x' -> 10;
            case 'L', 'l' -> 50;
            case 'C', 'c' -> 100;
            case 'D', 'd' -> 500;
            case 'M', 'm' -> 1000;
            default -> 0;
        };
    }

}
