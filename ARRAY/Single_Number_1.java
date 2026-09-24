import java.util.*;
public class Single_Number_1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                int c=0;
                for(int j = 0; j < n; j++){
                    if(nums[i] == nums[j]){
                        c++;
                    }
                }
                if(c == 1){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}