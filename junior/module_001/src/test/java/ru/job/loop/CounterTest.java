package ru.job.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenResult30() {
        Counter counter = new Counter();
        int result = counter.add(1,10);
        int expected = 30;
        assertThat(expected,is(result));
    }
}
