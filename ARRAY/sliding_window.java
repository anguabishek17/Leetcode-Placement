public class sliding_window {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int n = arr.length;

        if (k > n) {
            System.out.println("Window size is larger than the array size.");
            return;
        }

        System.out.println("Sliding window sums:");
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.println("Sum of window starting at index " + i + ": " + sum);
        }
    }
}
