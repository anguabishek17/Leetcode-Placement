import java.util.*;
public class swap_position {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(arr));
        int pos1 = 1; 
        int pos2 = 3; 
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

        System.out.println("Array after swapping elements at positions " + pos1 + " and " + pos2 + ": " + Arrays.toString(arr));
    }
}