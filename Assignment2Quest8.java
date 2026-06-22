package com.dsa;
import java.util.Scanner;

public class Assignment2Quest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // to find out wheather the given String Palinfrome or not.

        String input ;
        boolean isPalindrome = true;
        System.out.println("Enter a string: ");
        input = sc.nextLine();
        // Convert to lowercase for case INsensitive comparison
        String str = input.toLowerCase();

        // Compare characters from start and end
        int i = 0;
        int j = str.length() - 1;
        while (j > i ) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }

            i++;
            j++;

        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        sc.close();
    }
}
