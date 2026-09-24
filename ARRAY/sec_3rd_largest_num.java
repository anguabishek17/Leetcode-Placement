import java.util.*;
public class sec_3rd_largest_num {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i] > first){
                    third = second;
                    second = first;
                    first = arr[i];
                }
                else if(arr[i] > second && arr[i] != first){
                    third = second;
                    second = arr[i];
                }
                else if(arr[i] > third && arr[i] != second && arr[i] != first){
                    third = arr[i];
                }
            }
            System.out.println("Second largest: " + second);
            System.out.println("Third largest: " + third);  
        }   
    }
}
