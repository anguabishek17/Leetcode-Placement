package STRING;
import java.util.*;
public class check_index {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String a = sc.next();
            String b = sc.next();
            System.out.print(a.indexOf(b)); 
        }
    }
}
