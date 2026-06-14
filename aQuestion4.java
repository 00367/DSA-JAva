package com.dsa;
import java.util.Scanner;

public class aQuestion4 {
    // Function  to find HCF using Euclidean algorithms
    public static int findHCF ( int a , int b) {
        while( b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        // find HCF
        int hcf = findHCF(num1 , num2);

        // Find LCM using formula : LCM = (a * b ) / HCF

        int lcm = (num1 * num2) / hcf;
        System.out.println("\nHCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is:" + lcm);


        sc.close();


    }
}
