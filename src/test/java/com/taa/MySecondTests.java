package com.taa;

import com.taa2020.BasicCalculator;
import com.taa2020.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("sanity")
@ExtendWith(ReporterTestException.class)
public class MySecondTests {

    private static final Logger logger = LogManager.getLogger(MySecondTests.class);
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
        a = 20;
        b = 30;
        c = 40;
    }

    @AfterAll
    public static void afterAllTests() {
        logger.info("Ending my test suite");
    }

    @Tag("regression")
    @Tag("security")
    @Test
    public void testSum() {

        // GIVEN - precondition - to have a new calculator
        Calculator calculator = new Calculator();

        // WHEN - what we test - our action
        int sum = calculator.add2(++a, b++);

        // THEN - expected result
        // logger.info(sum);
        assertThat("Sum of numbers failed", sum, is(51));  // assertion from hamcrest
    }

    @Test
    public void testMultiply() {

        // GIVEN
        Calculator calculator = new Calculator();

        // WHEN
        int m = calculator.multiply(a, b, c);

        // THEN
        //logger.info(m);
        assertEquals(24000, m);  // JUnit assertion - if this fails, the second one is not checked
        assertTrue(m == 24000);  // JUnit assertion
    }

    @Test
    public void testDivide() {

        // GIVEN
        BasicCalculator bc = new BasicCalculator();

        // WHEN
        double d = bc.divide(20, 6);

        // THEN
        assertThat(d, closeTo(3.3, 0.04)); // second argument is tolerance
        // method allows values between 3.32 and 3.34
        // it will fail for delta = 0.03
    }

}
