package ru.job.calculator;

/**
 * Конвертер валюты
 */
public class Convertor {

    /**
     * Конвертируем рубли в евро
     *
     * @param value рубли
     * @return евро
     */
    public int rubToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары
     *
     * @param value рубли
     * @return доллары
     */
    public int rubToDollars(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли
     *
     * @param value евро
     * @return рубли
     */
    public int euroToRub(int value) {
        return value * 70;
    }

    /**
     * Конвертируем доллары в рубли
     *
     * @param value доллары
     * @return рубли
     */
    public int dollarsToRub(int value) {
        return value * 60;
    }


}
