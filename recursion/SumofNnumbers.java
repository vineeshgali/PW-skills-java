import java.util.*;
public class SumofNnumbers {
    public static int sum(int n){
        if(n==1) return 1;
        n+=sum(n-1);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}