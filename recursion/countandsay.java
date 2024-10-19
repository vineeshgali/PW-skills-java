import java.util.*;

public class countandsay {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }

    private static String count(int n) {

        if(n==1){
            return "1";
        }
        String prev=count(n-1);
        String s="";
        Integer c=1;
        for (int i = 0; i < prev.length(); i++) {
            if(i+1 < prev.length() && prev.charAt(i)==prev.charAt(i+1)) {
                c++;
            }else {
                s+=(c.toString());
                s+=(prev.charAt(i));
                c=1;
            }
        }
        return s;
    }
}
