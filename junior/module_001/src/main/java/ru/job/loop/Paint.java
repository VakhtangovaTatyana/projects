package ru.job.loop;

import java.util.function.BiPredicate;

/**
 * @author Vakhtangova Tatyana (sharkka@mail.ru)
 */
public class Paint {


    //Java Generics
    private String loopBy(int height, int width, BiPredicate<Integer, Integer> predicat) {
        //Буфер для результата
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row < height; row++) {//row - стркоа
            for (int column = 0; column < width; column++) {
                if (predicat.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String rightTriangle(int height) {
        return this.loopBy(height, height, (row, column) -> row >= column); // лямбда функция = анонимная функция
    }

    public String leftTriangle(int height) {
        return this.loopBy(height, height, (row, column) -> row >= height - column - 1); // лямбда функция = анонимная функция
    }

    public String piramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && column <= ((height * 2 - 1) / 2 + row)
        ); // лямбда функция = анонимная функция
    }

}
