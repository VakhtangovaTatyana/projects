package ru.job.max;

public class Max {
    //Перегрузка метода = два метода с одинаковыми именами,но с разным числом аргументов
    public int max(int first, int second) {
        return first > second ? first : second;

    }

    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return this.max(temp, third);
    }

}
