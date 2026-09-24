
public class Container_With_Most_Water_11 {
    public static void main(String[] args) {
        int []con={11,22,39,49,51,32,19,42,24,28,22};
        int l=0;
        int r=con.length-1;
        for(int i=0;i<con.length;i++){
           int area=Math.min(con[l],con[r])*(r-l);
            if(con[l]<con[r]){
                l++;
            }else{
                r--;
            }
            System.out.println("Area: "+area);
        }
    }
}
