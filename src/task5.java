import java.util.Scanner;

public class task5 {
    public task5() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        for(int i = 0; i < scores.length; ++i) {
            System.out.print("Enter score " + (i + 1) + " (0-100): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            } else {
                int value = scanner.nextInt();
                if (value >= 0 && value <= 100) {
                    scores[i] = value;
                } else {
                    System.out.println("Score must be between 0 and 100. Try again.");
                }
            }
        }

        int passed = 0;
        int failed = 0;
        int sum = 0;

        for(int i = 0; i < scores.length; ++i) {
            sum += scores[i];
            if (scores[i] >= 60) {
                ++passed;
            } else {
                ++failed;
            }
        }

        double average = (double)sum / (double)scores.length;
        System.out.print("Scores:");

        for(int i = 0; i < scores.length; ++i) {
            System.out.print("" + scores[i]);
        }

        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + average);
        scanner.close();
    }
}
