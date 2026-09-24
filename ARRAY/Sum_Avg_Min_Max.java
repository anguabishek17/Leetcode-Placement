import java.util.*;
public class Sum_Avg_Min_Max {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int min = arr[0];
            int max = arr[0];
            for(int i = 0; i < n; i++){
                sum += arr[i];
                if(arr[i] < min){
                    min = arr[i];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            double avg = (double) sum / n;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }
    }
}
