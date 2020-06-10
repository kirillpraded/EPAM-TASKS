package com.company;
//площадь периметр точка пересечения медиан
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.sideA = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
        this.sideB = Math.sqrt(Math.pow((b.getX() - c.getX()), 2) + Math.pow((b.getY() - c.getY()), 2));
        this.sideC = Math.sqrt(Math.pow((c.getX() - a.getX()), 2) + Math.pow((c.getY() - a.getY()), 2));
    }

    public double getPerim(){
        return sideA+sideB+sideC;
    }
    public double getArea(){
        double haldPerim = getPerim()/2;
        double area = Math.sqrt(haldPerim*(haldPerim-sideA)*(haldPerim-sideB)*(haldPerim-sideC));
        return area;
    }
    public Point getMedian() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(x, y);
    }
}
