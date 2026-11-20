public class task1 {
    public task1() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, -3, 0, 8, -1, 0, 12, -7, 4, 2};
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] > 0) {
                ++positive;
            } else if (arr[i] < 0) {
                ++negative;
            } else {
                ++zero;
            }
        }

        System.out.print("Array:");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
