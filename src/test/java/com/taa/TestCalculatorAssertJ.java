package com.taa;

import com.taa2020.BasicCalculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCalculatorAssertJ {

    @Test
    public void testSubtract(){
        // GIVEN
        BasicCalculator bc = new BasicCalculator();

        // WHEN
        int result = bc.subtract(6, 10);

        // THEN
        assertThat(result).isNotNull()
                .isEqualTo(-4)
                .isNegative()
                .isBetween(-6, 0);
    }
}
