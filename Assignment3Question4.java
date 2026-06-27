package com.dsa;
import java.util.Scanner;

public class Assignment3Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // program in isosceles Traingle  area

        System.out.println("Enter equal side(a): ");
        double a = sc.nextDouble();
        System.out.println("Enter equal side(b):");
        double b = sc.nextDouble();

        // Cheak validity : in isosceles triangle , 2a>b
        if ( 2 * a <= b) {
            System.out.println("Invalid sides for an isosceles triangle.");
        } else {
            double area = (b * Math.sqrt(4 * a * a - b * b)) / 4.0;

            System.out.println("Area of isosceles triangle = " + area);
        }

        sc.close();



    }
}
