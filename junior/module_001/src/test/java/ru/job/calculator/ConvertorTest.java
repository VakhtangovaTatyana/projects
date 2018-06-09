package ru.job.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConvertorTest {

    @Test
    public void when60RubThen1Dollar() {
        Convertor convertor = new Convertor();
        int result = convertor.rubToDollars(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubThen1Euro() {
        Convertor convertor = new Convertor();
        int result = convertor.rubToEuro(70);
        assertThat(result, is(1));
    }

    @Test
    public void when5EuroThen350Rub() {
        Convertor convertor = new Convertor();
        int result = convertor.euroToRub(5);
        assertThat(result, is(350));
    }

    @Test
    public void when5DollarsThen300Rub() {
        Convertor convertor = new Convertor();
        int result = convertor.dollarsToRub(5);
        assertThat(result, is(300));
    }
}
