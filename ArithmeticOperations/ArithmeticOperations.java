package com.bridgelabz.day2.ArithmeticOperations;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        //i) a+b*c ii) c+a/b
        //iii) a%b+c iV) a*b+c

        int c1 = (a + b * c);
        int c2 = (c + a / b);
        int c3 = (a % b + c);
        int c4 = (a * b + c);
        //using if else

        if (c1 > c2 && c1 > c3 && c1 > c4) {
            System.out.println("Condition 1 is greater:" + c1);

        } else if (c2 > c1 && c2 > c3 && c2 > c4) {
            System.out.println("Condition 2 is greater:" + c2);

        } else if (c3 > c1 && c3 > c2 && c3 > c4) {
            System.out.println("Condition 3 is greater:" + c3);
        } else {
            System.out.println("Condition  4 is greater:" + c4);
        }
        if (c1 < c2 && c1 < c3 && c1 < c4) {
            System.out.println("Condition 1 is Smaller:" + c1);

        } else if (c2 < c1 && c2 < c3 && c2 < c4) {
            System.out.println("Condition 2 is Smaller:" + c2);

        } else if (c3 < c1 && c3 < c2 && c3 < c4) {
            System.out.println("Condition 3 Smaller:" + c3);
        } else {
            System.out.println("Condition 4 is Smaller:" + c4);
        }
    }

}