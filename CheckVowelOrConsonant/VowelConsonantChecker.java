package com.bridgelabz.day2.CheckVowelOrConsonant;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character in lower case only:");
        char input = sc.next().charAt(0);
        // using switch case
        switch (input){
            case 'a':
                System.out.println("input character is vowel");
                break;
            case 'e':
                System.out.println("input character is vowel");
                break;
            case 'i':
                System.out.println("input character is vowel");
                break;
            case 'o':
                System.out.println("input character is vowel");
                break;
            case 'u':
                System.out.println("input character is vowel");
                break;
            default:
                System.out.println("input character is Consonant");
                break;
        }

    }
}
