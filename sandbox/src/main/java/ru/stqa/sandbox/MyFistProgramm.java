package ru.stqa.sandbox;

public class MyFistProgramm {

    public static void main(String[] args) {
        hello("e332");
        double l = 6;
        Square s = new Square(4);
        Rectangle r = new Rectangle();
        System.out.println(areea(s));
        System.out.println(areea(r));
    }

    public static void hello(String one) {
        System.out.println(one);
    }

    public static double areea(Square s) {
        return s.l * s.l;
    }

    public static double areea(Rectangle r) {
        return r.a * r.b;
    }
}



