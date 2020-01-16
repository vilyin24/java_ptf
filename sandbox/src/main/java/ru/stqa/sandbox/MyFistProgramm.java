package ru.stqa.sandbox;

public class MyFistProgramm {

    public static void main(String[] args) {
        hello("e332");
        double l = 6;
        System.out.println(areea(l));
        System.out.println(areea(4,5));
    }

    public static void hello(String one) {
        System.out.println(one);
    }

    public static double areea(double l) {
        return l * l;
    }

    public static double areea(double a, double b) {
        return a * b;
    }
}



