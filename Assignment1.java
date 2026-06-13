package com.dsa;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // input a year and find whether it is leap year or not

        System.out.println("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 ) || ( year % 4  ==  0 && year % 100 == 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

        sc.close();


    }

}