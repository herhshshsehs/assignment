public class task3 {
    public task3() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }

        double average = (double)sum / (double)arr.length;
        int count = 0;

        for(int i = 0; i < arr.length; ++i) {
            if ((double)arr[i] > average) {
                ++count;
            }
        }

        System.out.print("Array:");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}
