public class Task_4 {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        boolean hasDuplicates = false;
        System.out.print("Duplicate numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            boolean printed = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    printed = true;
                }
            }

            if (count > 1 && printed == false) {
                System.out.print(numbers[i] + " ");
                hasDuplicates = true;
            }
        }

        if (hasDuplicates == false) {
            System.out.print("no duplicates found");
        }
        System.out.println();
    }
}