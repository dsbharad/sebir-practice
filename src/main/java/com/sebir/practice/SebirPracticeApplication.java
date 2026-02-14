package com.sebir.practice;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sebir.practice.strings.easy.romanToInteger.RomanToInteger;

@SpringBootApplication
public class SebirPracticeApplication {

	private static final Logger logger = org.slf4j.LoggerFactory.getLogger(SebirPracticeApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SebirPracticeApplication.class, args);
        logger.info("\n Beginning the work");
        int result = RomanToInteger.solve("MCMXCIV");
        logger.info("\n Result of Roman to Integer conversion: {}", result);
        logger.info("\n End of the work");
    }

}
