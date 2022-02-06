package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        double len = 5;
        System.out.println("площадь квадрата со стороной " + len + "=" + area(len));
        double a = 4;
        double b = 6;
        System.out.println("площадь треугольника со сторонами" + a + "и" + b + "=" + area(a,b));
    }
    public static void hello(String somebode){

        System.out.println("hell " + somebode + "!");
    }

    public static double area(double i){
        return i * i;
    }

    public static double area(double a, double b){
        return a * b;
    }
}
