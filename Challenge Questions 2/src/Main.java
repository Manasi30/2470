import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[5];
        int total = 0;
        int highest = 0;
        int lowest = 100;

            System.out.print("Enter 5 test scores seperated by spaces: ");
            for (int i = 0; i < scores.length; i++) {
                scores[i] = input.nextInt();

            total += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }



        double average = (double)total / scores.length;

            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);


            System.out.println();
            System.out.println("Your values were:");

            for (int score : scores) {
                char grade;

                if (score >= 90){
                    grade = 'A';
                }
                else if (score >= 80){
                    grade = 'B';
                }
                else if (score >= 70){
                    grade = 'C';
                }
                else if (score >= 60){
                    grade = 'D';
                }
                else {
                    grade = 'F';
                }
                System.out.println(score + " - " + grade);
            }


        input.close();

    }
}