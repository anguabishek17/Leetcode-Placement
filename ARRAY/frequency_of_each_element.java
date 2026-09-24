import java.util.*;
public class frequency_of_each_element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        int n = arr.length;
        int[] freq = new int[n];
        Arrays.fill(freq, -1);
        for (int i = 0; i < n; i++) {
            if (freq[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        freq[j] = 0;
                    }
                }
                freq[i] = count;
            }
        }
        System.out.print(  "-------------------------\n");
        System.out.println("|  Element   | Frequency|");
        System.out.print(  "-------------------------\n");
        for (int i = 0; i < n; i++) {
            if (freq[i] != 0) {
                System.out.println("|      " + arr[i] + "     |     " + freq[i] + "    |");
            }
        }
        System.out.print(  "-------------------------\n");
    }
}
