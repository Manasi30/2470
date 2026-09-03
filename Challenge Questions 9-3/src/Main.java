/* REPL App that the user will select from available commands such as add, subtract, multiply,divide,
random, reverse, and quit. The selected command will then execute the function attached to it.*/

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String command;
        System.out.println("Welcome to my REPL App!");

        int choice;

        do {
            System.out.println();
            System.out.print("> ");
            command = input.nextLine();

            if (command.equals("help")) {
                System.out.println();
                System.out.println(" add");
                System.out.println(" subtract");
                System.out.println(" multiply");
                System.out.println(" divide");
                System.out.println(" random");
                System.out.println(" reverse");
                System.out.println(" quit");
            } else if (command.equals("add")) {
                System.out.print("First number: ");
                double firstNumber = input.nextDouble();

                System.out.print("Second number: ");
                double secondNumber = input.nextDouble();

                double result = firstNumber + secondNumber;
                System.out.print("Result: " + result);

                input.nextLine();
            } else if (command.equals("subtract")) {
                System.out.print("First number: ");
                double firstNumber = input.nextDouble();

                System.out.print("Second number: ");
                double secondNumber = input.nextDouble();

                double result = firstNumber - secondNumber;
                System.out.print("Result: " + result);

                input.nextLine();
            } else if (command.equals("multiply")) {
                System.out.print("First number: ");
                double firstNumber = input.nextDouble();

                System.out.print("Second number: ");
                double secondNumber = input.nextDouble();

                double result = firstNumber * secondNumber;
                System.out.print("Result: " + result);

                input.nextLine();
            } else if (command.equals("divide")) {
                System.out.print("First number: ");
                double firstNumber = input.nextDouble();

                System.out.print("Second number: ");
                double secondNumber = input.nextDouble();

                double result = firstNumber / secondNumber;
                System.out.print("Result: " + result);

                input.nextLine();
            } else if (command.equals("random")) {
                System.out.print("Minimum: ");
                int minNumber = input.nextInt();

                System.out.print("Maximum: ");
                int maxNumber = input.nextInt();

                if (minNumber > maxNumber) {
                    System.out.println("Error: Minimum must be greater than maximum");
                } else {
                    int randomNumber = rand.nextInt(maxNumber - minNumber + 1) + minNumber;

                    System.out.println("Random Number: " + randomNumber);
                }
                input.nextLine();
            } else if (command.equals("reverse")) {
                System.out.print("Enter text:  ");
                String text = input.nextLine();

                String reversed = new StringBuilder(text).reverse().toString();
                System.out.println(reversed);
            } else if (command.equals("quit")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Unknown command. Type \"help\" for available commands.");
            }
        }
            while (!command.equals("quit"));
            input.close();



        }




    }
