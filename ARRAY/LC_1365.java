import java.util.Scanner;
public class LC_1365 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int size = sc.nextInt();
            int[] arr = new int[size];
            int[] b = new int[size];
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<size;i++){
                int count = 0;
                for(int j=0;j<size;j++){
                    if(arr[j]<arr[i]){
                        count++;
                    }
                }
                b[i] = count;
            }
            for(int i=0;i<size;i++){
                System.out.print(b[i] + " ");
            }
        }
    }
}
