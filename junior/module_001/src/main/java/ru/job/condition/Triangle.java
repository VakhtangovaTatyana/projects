package ru.job.condition;

import ru.job.calculator.Point;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimetr (double ab, double ac, double bc) {
        return (ab+ac+bc)/2.0;
    }

    public double area () {
        double result = -1;
        double ab = this.a.distanceTo(this.b);
        double bc = this.b.distanceTo(this.c);
        double ac = this.a.distanceTo(this.c);
        if (this.exist(ab,bc,ac) == true) {
            double p = perimetr(ab,ac,bc);
            result = Math.sqrt(p * (p -ab) * (p - bc) * (p - ac));
        }
        return result;
    }
    private boolean exist (double ab, double ac, double bc) {
        if(ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            return true;
        }
        return false;
    }
}
