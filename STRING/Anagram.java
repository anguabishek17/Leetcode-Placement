package STRING;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            String a= sc.next();
            String b= sc.next();
            char[] c= a.toCharArray();
            char[] d= b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);
            if(Arrays.equals(c,d)){
                System.out.println("It is an Anagram");
            }
            else{
                System.out.print("It is not an Anagram");
            }
        }
    }
}
