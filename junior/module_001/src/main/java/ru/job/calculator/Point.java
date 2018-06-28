package ru.job.calculator;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo (Point that) {
        return Math.sqrt((that.x-this.x) * (that.x-this.x) + (that.y-this.y) * (that.y-this.y));
    }
}


