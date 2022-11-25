package com.bridgelabz.day2.quadraticequation;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a, b, c:");
        System.out.println("Enter value of a:");
        double a = sc.nextDouble();
        System.out.println("Enter value of b:");
        double b = sc.nextDouble();
        System.out.println("Enter  value of c:");
        double c = sc.nextDouble();



        //  formula
        double delta = (b*b-4*a*c);

        System.out.println("delta:" +delta);

        // check delta is greater than 0

        // two real and distinct roots
        double firstroot = (-b + Math.sqrt(delta)) / (2 * a);
        double secondroot = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("First root:"+ firstroot);
        System.out.println("second root:"+ secondroot);


    }

}
