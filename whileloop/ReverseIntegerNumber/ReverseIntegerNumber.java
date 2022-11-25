package com.bridgelabz.day2.whileloop.ReverseIntegerNumber;
import java.util.Scanner;
public class ReverseIntegerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for reversing:");
        int input = sc.nextInt();
        int reverse = 0;
        int rem;
        while (input != 0){
            // adding last digit in reverse
             rem = input % 10;
             reverse = (reverse * 10 ) + rem;

             // removing last digit from input
             input = input/10;
        }
        System.out.println("reverse number is :"+reverse);
    }

}
