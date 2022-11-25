package com.bridgelabz.day2;
import java.util.Scanner;
public class NumberToString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter any number from 1, 10, 100, 1000:");
        int input = s.nextInt();
        if (input == 1){
            System.out.println("Unit");
        } else if (input == 10) {
            System.out.println("Tens");
        } else if (input == 100) {
            System.out.println("Hundreds");
        } else if (input == 1000) {
            System.out.println("One Thousand");
        }else {
            System.out.println("only allowed number are 1, 10, 100, 1000:");
        }
    }
}
