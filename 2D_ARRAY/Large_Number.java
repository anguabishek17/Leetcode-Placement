import java.util.*;
public class Large_Number {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int large=0;
            for(int i = 0; i < n; i++){
                int Sum=0;
                for(int j = 0; j < n; j++){
                    Sum+=arr[i][j];
                }
                if(Sum > large){
                    large = Sum;
                }
            }
            System.out.println(large);
        }
    }
}
