package com.bridgelabz.day2.ReverseNumberWithForLoop;
import  java.util.Scanner;

public class ReverseNumberWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to reverse:");
        int input = sc.nextInt();
        int reverse = 0;
        for (int i=input; i>0; i=i/10 ){
            // adding last number

          int rem = i % 10;
            reverse = (reverse * 10) + rem;
            // removing last digit from the input
        }
        System.out.println("Reverse number is:"+reverse);

    }
}
