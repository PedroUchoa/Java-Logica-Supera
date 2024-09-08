package org.example;

public class Flowers {

    public static void main(String[] args) {

        System.out.println(flowerValue(10, 0, 0, 5, 0, 0));
        System.out.println(flowerValue(4, 0, 0, 6, 0, 0));
        System.out.println(flowerValue( 5, 0, 0, 3, 4, 0));
    }

    public static String flowerValue(int r1, int x1,int y1,int r2,int x2,int y2) {
        double centerLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (centerLength + r2 <= r1) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }
}
