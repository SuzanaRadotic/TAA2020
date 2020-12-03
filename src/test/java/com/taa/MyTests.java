package com.taa;

import com.taa2020.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

public class MyTests {

    private static final Logger logger = LogManager.getLogger(MyTests.class);
//    private static final Calculator calculator = new Calculator();

//    public static void main(String[] args) {
//
//        logger.info(calculator.add2(2,3));
//    }

    private static int a;
    private static int b;
    private static int c;

    @BeforeEach
    public void beforeTest() {
        logger.info("Starting a test");
    }

    @AfterEach
    public void afterTest() {
        logger.info("Ending a test");
    }

    @BeforeAll
    public static void beforeAllTests() {
        logger.info("Starting my test suite");
        a = 2;
        b = 3;
        c = 4;
    }

    @AfterAll
    public static void afterAllTests() {
        logger.info("Ending my test suite");
    }

    @Test
    public void testSum() {

        // GIVEN - precondition - to have a new calculator
        Calculator calculator = new Calculator();

        // WHEN - what we test - our action
        int sum = calculator.add2(++a, b++);

        // THEN - expected result
        logger.info(sum);
    }

    @Test
    public void testMultiply() {

        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int m = calculator.multiply(a, b, c);

        // THEN
        logger.info(m);
    }

}
