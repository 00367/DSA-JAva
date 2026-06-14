package com.dsa;
import java.util.Scanner;

public class Assignment1Question3 {
    public static void main(String[] args) {
        // take a number as input and print the multiple table for it
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number ");
        int num = sc.nextInt();
        // print multiplication
        System.out.println("\nMultiplication Table for " + num + " : ");
        for (int i = 1 ; i <= num; i++) {
            System.out.println(num + " x" + i + " = " + (num * i));
        }

        sc.close();


    }
}
