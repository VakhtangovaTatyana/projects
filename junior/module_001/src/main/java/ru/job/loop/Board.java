package ru.job.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator(); // '\n'

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                //условие проверки, что писать пробел или x
                if ((i + j) % 2 == 0) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln); //добавляем перевод строки
        }
        return screen.toString();
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.paint(2,2));
    }
}
