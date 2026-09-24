package STRING;
import java.util.*;
public class LC_205 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            for(int i=0;i<s1.length();i++){
                char a = s1.charAt(i);
                char b = s2.charAt(i);
                if(s1.indexOf(a)!=s2.indexOf(b)){
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");
        }
    }
}

