import java.util.*;
public class Sort_Colors_75 {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] nums = new int[n];
            System.out.println("Enter the elements (0, 1, or 2):");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(nums[j]>nums[j+1]){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
            System.out.println("Sorted colors: " + Arrays.toString(nums));
        }
    }
}
