package com.gloria.assignment.calc;

import java.util.Scanner;

public class CalculatorDriver {
     static void main(String[] args) {

        CalculatorDriver.myMethod();

    }

    private static void myMethod(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1: Add  2: Subtract  3: Multiply  4: Divide  5: Power  6: Square Root  7: Modulus  0: Exit");

            // this block of code checks whwther the input read is the correct formart
            // if you try to enter r as your input, an invalid format response is returned
            // this prevalidation is done at the reading of input level
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int option = scanner.nextInt();
            if (option == 0) break;

            double a, b, result;
            try {
                switch (option) {
                    case 1 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter b: ");
                        b = scanner.nextDouble();
                        result = Calculator.add(a, b);
                    }
                    case 2 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter b: ");
                        b = scanner.nextDouble();
                        result = Calculator.subtract(a, b);
                    }
                    case 3 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter b: ");
                        b = scanner.nextDouble();
                        result = Calculator.multiply(a, b);
                    }
                    case 4 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter b: ");
                        b = scanner.nextDouble();
                        result = Calculator.divide(a, b);
                    }
                    case 5 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter b: ");
                        b = scanner.nextDouble();
                        result = Calculator.power(a, b);
                    }
                    case 6 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        result = Calculator.squareRoot(a);
                    }
                    case 7 -> {
                        System.out.println("Enter a: ");
                        a = scanner.nextDouble();
                        System.out.println("Enter b: ");
                        b = scanner.nextDouble();
                        result = Calculator.modulus(a, b);
                    }
                    default -> {
                        System.out.println("Invalid option, choose from the available options.");
                        continue;
                    }
                }
                System.out.println("Result: " + result);
                // this exception is specific for numbers since we are working with numbers.
                // we didnt want to pass a vaegue because sometimes it hides the real errors
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format");
            }
        }
        // this line here closes the scanner object to avoid memory leaks
        scanner.close();
        System.out.println("This is the end. Goodbye!");

    }
    }

