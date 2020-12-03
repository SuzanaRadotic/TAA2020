package com.taa;

import com.taa2020.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTests {

    private static final Logger logger = LogManager.getLogger(MyTests.class);
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {

        logger.info(calculator.add2(2,3));
    }
}
