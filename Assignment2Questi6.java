package com.dsa;
import java.util.Scanner;

public class Assignment2Questi6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rupees;
        double exchangeRate = 0.0106;
        double usd;
        System.out.println("Enter amout in rupees");
        rupees = sc.nextDouble();

        usd = rupees * exchangeRate;
        System.out.println("Equivalent amount is USD : $ " + usd);

        sc.close();
    }
}
