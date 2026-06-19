package com.dsa;
import java.util.Scanner;

public class Assignment2Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 , num2;
        System.out.println("Enter the first number :");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number :");
        num2 = sc.nextDouble();

        if(num1 > num2) {
            System.out.println("The largest nmber is: " + num1);

        } else if (num1 < num2) {
            System.out.println("The largest number is : " + num2);

        } else {
            System.out.println(" Both number are equal.");
        }

        sc.close();


    }
}
