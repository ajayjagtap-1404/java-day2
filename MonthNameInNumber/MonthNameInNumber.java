package com.bridgelabz.day2.MonthNameInNumber;
import java.util.Scanner;

public class MonthNameInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 12 for checking month: ");
        int num = sc.nextInt();
        // using switch case
        switch (num) {
            case 1:
                System.out.println("Name of month for 1 is January");
                break;
            case 2:
                System.out.println("Name of month for 2 is February");
                break;
            case 3:
                System.out.println("Name of month for 3 is March");
                break;
            case 4:
                System.out.println("Name of month for 4 is April");
                break;
            case 5:
                System.out.println("Name of month for 5 is May");
                break;
            case 6:
                System.out.println("Name of month for 6 is June");
                break;
            case 7:
                System.out.println("Name of month for 7 is July");
                break;
            case 8:
                System.out.println("Name of month for 8 is August");
                break;
            case 9:
                System.out.println("Name of month for 9 is September");
                break;
            case 10:
                System.out.println("Name of month for 10 is October");
                break;
            case 11:
                System.out.println("Name of month for 11 is November");
                break;
            case 12:
                System.out.println("Name of month for 12 is December");
                break;
            default:
                System.out.println("Invalid input please try again ...!");
                break;


        }
    }
}
