import java.util.*;
public class Transpose_matrix {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[a[0].length][a.length];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    b[j][i] = a[i][j] ;
                }
            }
            System.out.println("Transposed matrix: ");
            for(int i = 0; i < b.length; i++){
                for(int j = 0; j < b[0].length; j++){
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}         
