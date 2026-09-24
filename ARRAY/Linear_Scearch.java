import java.util.*;
public class Linear_Scearch {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int found = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] == k){
                    found = i + 1;
                    break;
                }
            }
            if(found == 1){
                System.out.println(k + " is found at position " + found + " in the array.");
            } else {
                System.out.println(k + " is not found in the array.");
            }
        }
    }   
}
