import java.util.*;
public class onetonusingrecurtion {
    public static void print(int n){
        int x=0;
        if(x==n) return;
        print(n-1);
        System.out.print(n+" ");
        x++;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
    
}