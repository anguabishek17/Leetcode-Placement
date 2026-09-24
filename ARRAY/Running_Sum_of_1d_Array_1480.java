import java.util.*;
public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] runningSum = new int[n];
        runningSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            runningSum[i] = runningSum[i - 1] + arr[i];
        }
        System.out.println("Running sum of the array: " + Arrays.toString(runningSum));
    }
}
}