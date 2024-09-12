import java.util.*;
public class Nto1usingRecurstion {
    public static void ptr(int n){
        if(n==0) return;
        System.out.println(n);
        ptr(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ptr(n);
        
    }
}
