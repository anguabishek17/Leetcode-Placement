public class second_largest_num {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        int sMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }
        System.out.println("Second largest number in the array: " + sMax);
    }
}
