public class smallest_num {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest number in the array: " + min);
    }
}
