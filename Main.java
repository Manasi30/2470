//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        // Challenge - Printing Output
        int age = 23;
        String name = "Manasi";
        double height = 5.6;
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.printf("Name: " + name);
            System.out.printf(" Age: " + age);
            System.out.println(" Height: " + height);


            // Challenge Operators
            int a = 20;
            int b = 10;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a > b);
            System.out.println(a > b && b > 0);

            // Challenge Control Flow
        int score = 75;
        char grade = 'B';

        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 75) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);

        // Challenge Loops
        // For loop
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);

            if (i < 5) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // While Loops
        System.out.print("While Loop: ");
        int j = 1;
        while (j <= 5) {
            System.out.print(j);
            if (j < 5) {
                System.out.print(" ");
            }
            j++;

        }
        System.out.println();

        //Do-While Loop
        System.out.print("Do-While Loop: ");
        int k = 1;
        do {
            System.out.print(k);
            if (k < 5) {
                System.out.print(" ");
            }
            k++;
        } while (k <= 5);
        System.out.println();

        // Challenge Calculator
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";
        while (again.equals("y")) {
            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);

            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);

            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);

            } else if (operator == '/') {

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
            }

            again = "n";
        }

        System.out.println("Thank you for using the calculator.");


    }
}