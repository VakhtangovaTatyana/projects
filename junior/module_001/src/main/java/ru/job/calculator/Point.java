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

    public static void main(String[] args) {
        Point a = new Point(0,1);
        Point b = new Point(2,5);

        double result = a.distanceTo(b);
        System.out.println(result);
    }
}


