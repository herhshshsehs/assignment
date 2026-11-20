public class task2 {
    public task2() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 28, 3, 19, 7, 15, 9};
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        System.out.print("Array:");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
        System.out.println("Largest: " + arr[maxIndex] + " at index " + maxIndex);
        System.out.println("Smallest: " + arr[minIndex] + " at index " + minIndex);
    }
}
