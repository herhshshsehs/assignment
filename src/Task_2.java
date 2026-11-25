public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 8, 30, 15, 30};

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        boolean found = false;
        int second = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != largest) {
                if (found == false) {
                    second = numbers[i];
                    found = true;
                } else if (numbers[i] > second) {
                    second = numbers[i];
                }
            }
        }

        if (found) {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + second);
        } else {
            System.out.println("No second largest distinct number.");
        }   
    }
}