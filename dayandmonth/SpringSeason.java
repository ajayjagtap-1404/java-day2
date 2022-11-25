package com.bridgelabz.day2.dayandmonth;

public  class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        boolean ans = (month == 3 && date >= 20 && date <= 31) || (month == 4 && date >= 1 && date <= 30)
                || (month == 5 && date >= 1 && date <= 31) || (month == 6 && date >= 1 && date <= 20);

        System.out.println(ans);


    }
}
