package com.dsa;
import java.util.Scanner;

public class Assignment3Quest2 {
    public static void main(String[] args) {

        // area of tringle
        Scanner sc = new Scanner(System.in);

        double base , height , area;
        System.out.println("Enter the base of tringle:");
        base = sc.nextDouble();

        System.out.println("Enter the height of tringle:");
        height = sc.nextDouble();

        area = (base * height) / 2;
        System.out.println("The area of tringle is" + area);

        sc.close();


    }
}
