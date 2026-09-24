package STRING;
import java.util.*;
public class LC_6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String a = sc.nextLine();
            int numrows = sc.nextInt();
            String[] c = new String[numrows];
            for(int i=0;i<numrows;i++){
                c[i] = sc.next();
            }
            int cr=0;
            boolean flag = true;
            for(char ch:a.toCharArray()){
                c[cr] += ch;
                if(cr==0||cr==numrows-1){
                    flag = !flag;
                }
                cr += flag?1:-1;
            }
            String ans = "";
            for(String s:c){
                ans += s;
            }
            System.out.println(ans);
        }
    }
}
