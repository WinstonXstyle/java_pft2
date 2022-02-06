package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        Square s = new Square(5);
        s.l = 5;
        System.out.println("площадь квадрата со стороной " + s.l + "=" + area(s));
        Rectangle r = new Rectangle(4,6);

        System.out.println("площадь треугольника со сторонами " + r.a + "и" + r.b + "=" + area(r));
    }
    public static void hello(String somebode){

        System.out.println("hell " + somebode + "!");
    }

    public static double area(Square s){
        return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }
}
