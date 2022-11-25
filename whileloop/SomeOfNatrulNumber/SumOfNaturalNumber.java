package com.bridgelabz.day2.whileloop.SomeOfNatrulNumber;
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any natural number:");
        int input = sc.nextInt();
        int i = 1;
        while (i < input){

            System.out.print(i+ "+");
            i++;
        }
        System.out.println(+input);
    }
}
