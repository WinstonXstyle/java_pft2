package ru.stqa.pft.sandbox;

public class Point{

    public static double x1;
    public static double y1;
    public static double x2;
    public static double y2;


        public static void main (String[]args){
            Point p1 = new Point();
            Point p2 = new Point();

            p1.x1 = 4;
            p1.y1 = 8;
            p2.x2 = 6;
            p2.y2 = 5;

            System.out.println("расстояние между точками " + x1 + ":" + y1 + " и " + x2 + ":" + y2 + " = " + p1.distance());
        }

        public double distance(){

            return  Math.sqrt((this.x2 - this.x1) * (this.x2 - this.x1) + (this.y2 - this.y1) * (this.y2 - this.y1));

        }



}
