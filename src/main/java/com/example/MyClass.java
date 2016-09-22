package com.example;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int binary = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        binary = in.nextInt();

        if (binary < 0)
        {
            System.out.println("Not a positive integer, please rerun program and try again");
        }

        else
        {
            System.out.print("The number " + binary + " is equal to ");
            binaryform(binary);
        }
    }


    private static Object binaryform(int binary)
    {
        int remainder = 0;

        if (binary <= 1)
        {
            System.out.print(binary);
            return null;
        }

        remainder = binary %2;
        binaryform(binary >> 1);
        System.out.print(remainder);
        {
            return "  ";
        }
    }
}