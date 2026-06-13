package com.dsa;
import java.util.Scanner;


public class Assignment1Ques2 {
    public static void main(String[] args) {
        // Take 2 number and print  the sum of both
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("sum = " + sum);

        sc.close();





    }
}
