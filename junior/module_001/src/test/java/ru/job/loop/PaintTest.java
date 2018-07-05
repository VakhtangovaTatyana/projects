package ru.job.loop;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenPiramid4Right() {
        Paint paint = new Paint();
        String result = paint.rightTriangle(4);
        System.out.println(result);
        assertThat(result, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("^   ")
                .add("^^  ")
                .add("^^^ ")
                .add("^^^^")
                .toString()
        ));
    }

    @Test
    public void whenPiramid4Left() {
        Paint paint = new Paint();
        String result = paint.leftTriangle(4);
        System.out.println(result);
        assertThat(result, is (
                new StringJoiner(System.lineSeparator(), "",System.lineSeparator())
                .add("   ^")
                .add("  ^^")
                .add(" ^^^")
                .add("^^^^")
                .toString()
        ));
    }

    @Test
    public void whenPiramid() {
        Paint paint = new Paint();
        String result = paint.piramid(4);
        System.out.println(result);
    }
}
