package com.dsa;
import java.util.Scanner;

public class Assignment3Question6 {
    public static void main(String[] args) {
        // Area of Rhombus in java
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first diagonal:");
        double d1 = sc.nextDouble();

        System.out.println("Enter the second diagonal:");
        double d2 = sc.nextDouble();

        if ( d1 <= 0 || d2 <= 0){
            System.out.println("Diagonal must be posistive:");
        } else {
            double area = ( d1 * d2) / 2;
            System.out.println("Area of rhombus " + area);

        }

        sc.close();

    }
}
