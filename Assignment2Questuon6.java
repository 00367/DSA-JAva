package com.dsa;
import java.util.Scanner;

public class Assignment2Questuon6 {
    public static void main(String[] args) {
        // to calculate fibonacci series up to n number
        Scanner sc = new Scanner(System.in);
        int n ;
        int first = 0 , second = 1;
        System.out.println("Enter the number of terms(n): ");
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("PLease enter a positive integer: ");
        } else if ( n == 1) {
            System.out.println("Fibonacci series up to  " + n + " terms :");
            System.out.println(first + " " + second);

            for (int i = 3 ; i <= n ; i++) {
                int next = first + second;
                System.out.println(" " + next);
                first = second;
                second = next;
            }
        }

        sc.close();

    }

}
