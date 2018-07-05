package ru.job.loop;

/**
 * @author Vakhtangova Tatyana (sharkka@mail.ru)
 */
public class Paint {
    /**
     * @param height высота
     * @return result пирамиду из символов ^ и пробелов
     */
    public String rightTriangle(int height) {
        //Буфер для результата
        StringBuilder screen = new StringBuilder();
        //ширина равна высоте
        int width = height;
        for (int row = 0; row < height; row++) {//row - стркоа
            for (int column = 0; column < width; column++) {
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }


    public String leftTriangle(int height) {
        //Буфер для результата
        StringBuilder screen = new StringBuilder();
        //ширина равна высоте
        int width = height;
        for (int row = 0; row < height; row++) {//row - стркоа
            for (int column = 0; column < width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }

    public String piramid(int height) {
        //Буфер для результата
        StringBuilder screen = new StringBuilder();
        //ширина равна высоте
        int width = height * 2 - 1;
        for (int row = 0; row < height; row++) {//row - стркоа
            for (int column = 0; column < width; column++) {
                if (row >= height - column - 1 && column <= ((height * 2 - 1) / 2 + row)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }

        return screen.toString();
    }
}
