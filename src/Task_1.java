public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};

        System.out.print("Original: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
                count++;
            }
        }

        System.out.print("Modified: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Replacements: " + count);
    }
}