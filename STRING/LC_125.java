package STRING;
import java.util.*;
public class LC_125 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(Character.isLetterOrDigit(c)){
                    s+=c;
                }
                }
                String b=" ";
                for(int i=s.length()-1;i>=0;i--){
                    b+=s.charAt(i);
                }
                if(s.equals(b)){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
        }
    }
}
