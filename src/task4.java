public class task4 {
    public task4() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 12, 5, 9, 2, 7};
        System.out.print("Original:");

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
        System.out.print("Reversed:");

        for(int i = arr.length - 1; i >= 0; --i) {
            System.out.print(" " + arr[i]);
        }

        System.out.println();
    }
}
