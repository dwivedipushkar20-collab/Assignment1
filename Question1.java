package Assingment1;

import java.util.Scanner;

public class Question1 {

    static int addition(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        return (double) a / b;
    }

    static int remainder(int a, int b) {
        return a % b;
    }

    static int square(int a) {
        return a * a;
    }

    static int cube(int a) {
        return a * a * a;
    }

    static int absolute(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square");
            System.out.println("7. Cube");
            System.out.println("8. Absolute Value");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();

                    System.out.println("Addition = " + addition(a, b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    b = sc.nextInt();

                    System.out.println("Subtraction = " + subtraction(a, b));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    b = sc.nextInt();

                    System.out.println("Multiplication = " + multiplication(a, b));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    b = sc.nextInt();

                    if (b != 0) {
                        System.out.println("Division = " + division(a, b));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();

                    System.out.print("Enter second number: ");
                    b = sc.nextInt();

                    if (b != 0) {
                        System.out.println("Remainder = " + remainder(a, b));
                    } else {
                        System.out.println("Cannot find remainder with zero.");
                    }
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextInt();

                    System.out.println("Square = " + square(a));
                    break;

                case 7:
                    System.out.print("Enter number: ");
                    a = sc.nextInt();

                    System.out.println("Cube = " + cube(a));
                    break;

                case 8:
                    System.out.print("Enter number: ");
                    a = sc.nextInt();

                    System.out.println("Absolute Value = " + absolute(a));
                    break;

                case 9:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}