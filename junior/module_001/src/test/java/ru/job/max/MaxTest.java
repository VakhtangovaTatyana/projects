package ru.job.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void dataTest () {
        Max maxim = new Max();
        int result = maxim.max(1,2);
        assertThat(result,is(2));
    }

    @Test
    public void whenSecondLessFirst () {
        Max maxim = new Max();
        int result = maxim.max(2,1);
        assertThat(result,is(2));
    }

    @Test
    public void whenWeHave3Numbers() {
        Max maxim = new Max();
        int result = maxim.max(2,1,3);
        assertThat(result,is(3));
    }
}
