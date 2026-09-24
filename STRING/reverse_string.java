package STRING;
import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String n = sc.next();
            char [] arr = n.toCharArray();
            int l=0;
            int r=n.length()-1;
            while(l<r){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            System.out.println(new String(arr));
        }
    }
}
