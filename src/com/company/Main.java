package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here

        try {
            System.out.println("Pick a number 1 through 100");
            input.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println("You didnt type a number in");
            input.nextLine();
        }

        System.out.println("This is after our try catch block");

        Main main = new Main();
        main.aTestMethod();
    }

    private void aTestMethod() throws ArithmeticException {

        System.out.println("what is the numerator you would like to divide?");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.println("what is the denominator you would like to divide?");
        int num2 = input.nextInt();
        input.nextLine();

        System.out.println(divide(num1, num2));

        System.out.println("After our throws");
    }

    private int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("You can\'t divide by zero!");
        } else {
            return a / b;

        }
    }


    



}