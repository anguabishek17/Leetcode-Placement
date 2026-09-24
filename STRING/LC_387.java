package STRING;
import java.util.*;
public class LC_387 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        String s = sc.next();
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
}