package ru.stqa.sandbox;

public class MyFistProgramm {

    public static void main(String[] args) {


        System.out.println("Площадь квадрата равна " + area(5,6));

    }

    public static void Hello(String somebady) {
        System.out.println("Hello world" + somebady);
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}

