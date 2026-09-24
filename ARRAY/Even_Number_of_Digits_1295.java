import java.util.*;
public class Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements:");
            int tar = 0;
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(nums[i]>0){
                    tar++;
                }
            }
            System.out.println("Count of numbers with even number of digits: " + tar);
        }
    }
}
