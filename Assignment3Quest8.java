package com.dsa;
import java.util.Scanner;

public class Assignment3Quest8 {
    public static void main(String[] args) {
        // perimetere of circle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        System.out.println("The perimeter of circle  is " + perimeter);
        sc.close();
    }
}
