package com.bridgelabz.day2.PalindromeChecker;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int input = sc.nextInt();
        int reverse = 0;
        for (int i=input; i>0; i=i/10) {
            // Adding the last number in the reverse
            int rem = i % 10;

                reverse = (reverse * 10) + rem;
            // Removing last digit from input
        }
            // Checking number are palindrome
            if (input == reverse){
                System.out.println("number is palindrome");
            }else{
                System.out.println("not a palindrome number");
            }

    }
}
