package com.bridgelabz.day2;

import java.util.Scanner;


public class SingleDigitNumberChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter any single digit number");
        int number = s.nextInt();
        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("two");
        }
        else if (number == 3){
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        }
        else if (number == 5){
            System.out.println("five");
        }
        else if (number == 6){
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        }
        else if (number == 8){
            System.out.println("Eight");
        }
        else if (number == 9){
            System.out.println("Nine");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
