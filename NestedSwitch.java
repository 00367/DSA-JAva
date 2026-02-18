package com.dsa;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 :
                System.out.println("Abhishek yadav");
                break;
            case 2 :
                System.out.println("hagana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("no departmentment enter");

                }

            default:
                System.out.println("Enter correct department");


        }

    }
}
