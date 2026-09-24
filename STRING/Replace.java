package STRING;
import java.util.*;
public class Replace {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            String a=sc.next();
            System.out.print(a.replace(".","[.]"));
        }
    }
}
