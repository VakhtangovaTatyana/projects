package ru.job.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void when3Add6ThenResult9() {
        Calculator calculator = new Calculator();
        calculator.add(3D, 6D);
        double result = calculator.getResult();
        double expected = 9D;

        assertThat(result, is(expected));
    }

    @Test
    public void when3Mult6ThenResult18() {
        Calculator calculator = new Calculator();
        calculator.mult(3D, 6D);
        double result = calculator.getResult();
        double expected = 18D;
        assertThat(result, is(expected));
    }

    @Test
    public void when6Div3ThenResult2() {
        Calculator calculator = new Calculator();
        calculator.div(6D, 3D);
        double result = calculator.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
