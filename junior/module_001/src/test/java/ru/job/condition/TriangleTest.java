package ru.job.condition;

import org.junit.Test;
import ru.job.calculator.Point;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

        @Test
        public void whenTriangleExist() {
            Point a = new Point(0, 0);
            Point b = new Point(0, 3);
            Point c = new Point(4, 0);
            Triangle triangle = new Triangle(a, b, c);

            double expected = 6.0;

            assertThat(expected, is(triangle.area()));
        }

        @Test
        public void whenTriangleNotExist() {
            Point a = new Point(0,0);
            Point b = new Point(0,0);
            Point c = new Point(4,0);
            Triangle triangle = new Triangle(a, b, c);

            double expected = -1.0;
            assertThat(expected, is(triangle.area()));
        }

        @Test
        public void whenTriangleIsNotAccurate() {
            Point a = new Point(0, 0);
            Point b = new Point(0, 3);
            Point c = new Point(4, 0);
            Triangle triangle = new Triangle(a, b, c);
            double result = triangle.area();
            double expected = 5.9;

            assertThat(result, closeTo(expected, 0.1));
        }
}






