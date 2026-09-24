import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - i - 1; j++){
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }
}
