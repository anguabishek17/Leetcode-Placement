import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int found = -1;
            int l = 0, r = n - 1;
            while(l <= r){
                int mid = l + (r - l) / 2;
                if(arr[mid] == k){
                    found = mid + 1;
                    break;
                } else if(arr[mid] < k){
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            if(found != -1){
                System.out.println(k + " is found at position " + found + " in the array.");
            } else {
                System.out.println(k + " is not found in the array.");
            }
        }
    }
}
