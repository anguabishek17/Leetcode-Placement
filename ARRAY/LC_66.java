import java.util.*;
public class LC_66 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] digits = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                digits[i] = sc.nextInt();
            }
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    System.out.println("Result: " + Arrays.toString(digits));
                    return;
                }
                digits[i] = 0;
            }
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1;
            System.out.println("Result: " + Arrays.toString(newDigits));
        }
    }
}
