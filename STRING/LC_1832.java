package STRING;
import java.util.*;
public class LC_1832 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String a=sc.next();
            for(char ch='a';ch<'z';ch++){
                if(a.indexOf(ch)==-1){
                    System.out.println("the sentence comtains only a-z characters");
                }
                else{
                    System.out.println("the sentence comtains other than a-z characters");
                }
            }
        }
    }
}
