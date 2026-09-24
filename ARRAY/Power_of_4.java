import java.util.Scanner;
public class Power_of_4 {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n<=0){
                System.out.println("Enter a positive number");
            }
            while(n%4==0){
                n/=4;
            }
            if(n==1){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}