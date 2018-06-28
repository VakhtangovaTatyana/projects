package ru.job.loop;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class BoardTest {
    @Test
    public void when3x3() {
        Board board = new Board();
        String result = board.paint(3,3);
        String ln = System.lineSeparator();
        assertThat(result, is(String.format("x x%s x %sx x%s", ln, ln, ln)));
    }

    @Test
    public void when2x2() {
        Board board = new Board();
        String result = board.paint(2,2);
        String ln = System.lineSeparator();
        assertThat(result, is(String.format("x %s x%s", ln, ln)));
    }
}
