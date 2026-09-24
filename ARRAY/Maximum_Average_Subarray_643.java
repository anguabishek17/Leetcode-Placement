import java.util.*;
public class Maximum_Average_Subarray_643 {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements:");
            for(int i=0; i<n; i++){
                nums[i] = sc.nextInt();
            }
            System.out.print("Enter the value of k: ");
            int k = sc.nextInt();
            double maxSum = 0;
            for(int i=0; i<k; i++){
                maxSum += nums[i];
            }
            double currentSum = maxSum;
            for(int i=k; i<n; i++){
                currentSum += nums[i] - nums[i-k];
                maxSum = Math.max(maxSum, currentSum);
            }
            double maxAverage = maxSum / k;
            System.out.println("Maximum average subarray of length " + k + ": " + maxAverage);
        }
    }
}
