import java.util.Scanner;

public class ValidParenthasis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        valid(0,0,n,"");
    }

    private static void valid(int open, int close, int n, String s) {
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) valid(open+1,close,n, s+"(");
        if(close<open) valid(open,close+1,n,s+")");
    }
}
