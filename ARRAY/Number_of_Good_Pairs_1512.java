import java.util.*;
public class Number_of_Good_Pairs_1512 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            System.out.println("Number of good pairs: " + count);
        }
    }
}
