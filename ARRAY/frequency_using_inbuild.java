import java.util.*;
public class frequency_using_inbuild {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 3};
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int num : arr) {
            m1.put(num, m1.getOrDefault(num, 0) + 1);
        }

        System.out.print(  "-------------------------\n");
        System.out.println("|  Element   | Frequency|");
        System.out.print(  "-------------------------\n");
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            System.out.println("|      " + entry.getKey() + "     |     " + entry.getValue() + "    |");
        }
        System.out.print(  "-------------------------\n");
    }
}
