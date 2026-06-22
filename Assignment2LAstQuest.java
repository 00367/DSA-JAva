package com.dsa;
import java.util.Scanner;

public class Assignment2LAstQuest {
    public static void main(String[] args) {
        // TO find Armstrong Number between two given number.
        int low , high;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter starting number:");
        low = sc.nextInt();
        System.out.println("Enter ending number:");
        high = sc.nextInt();

        System.out.println("Armstrong number between " + low + " and " + high + " : ");

        for (int number = low ; number <= high ; number++) {
            if (isArmstrong(number)) {
                System.out.println(number + " ");
            }
        }
        sc.close();

    }

    // method to cheak if a number is Armstong
    static boolean isArmstrong(int num) {
        int original = num;
        int digits = 0;
        int sum = 0;

        // Count the number of digits
        while (num != 0) {
            digits++;
            num /= 10;
        }

        num = original;

        // calculate sum of the digits raised to the power of digits count
        while (num != 0) {
            int remainder = num% 10;
            sum += (int) Math.pow(remainder, digits);
            num /= 10;

        }
        return sum == original;
    }
}
