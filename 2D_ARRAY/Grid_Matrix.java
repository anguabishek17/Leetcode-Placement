import java.util.*;
public class Grid_Matrix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i==j || i+j==n-1){
                        if(arr[i][j] == 0){
                            System.out.println("false");
                        }
                    }
                    else{
                        if(arr[i][j] != 0){
                            System.out.println("false");
                        }
                }
            }
        }
        System.out.println("true");
    }
}
}
