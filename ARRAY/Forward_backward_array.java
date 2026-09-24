import java.util.*;
public class Forward_backward_array {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Forward array: " + Arrays.toString(arr));
            System.out.print("Backward array: [");
            for(int i = n - 1; i >= 0; i--){
                System.out.print(arr[i]);
                if(i != 0){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
