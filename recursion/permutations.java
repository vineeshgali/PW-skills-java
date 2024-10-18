import java.util.*;
public class permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String scr=sc.nextLine();
        PrintPerumutations("",scr);
    }

    private static void PrintPerumutations(String ans, String scr) {
        if(scr.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<scr.length();i++){
            char ch=scr.charAt(i);
            String left=scr.substring(0,i);
            String right=scr.substring(i+1);
            PrintPerumutations(ans+ch,left+right);
        }
    }
}
