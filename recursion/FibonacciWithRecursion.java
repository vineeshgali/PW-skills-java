import java.util.*;
public class FibonacciWithRecursion {
    public static int fib(int n){
        if(n<=1) return n;
        int ans=fib(n-1)+fib(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
