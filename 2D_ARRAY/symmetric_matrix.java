import java.util.*;
public class symmetric_matrix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(a[i][j] != a[j][i]){
                        System.out.println("The matrix is not symmetric.");
                        return;
                    }
                }
            }
            System.out.println("The matrix is symmetric.");
        }
    }
}
