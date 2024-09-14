import java.util.*;
public class PowerOfNumberWithRecursion {
    public static int pow(int a,int b){
        if(b==0) return 1;
        int ans=a*pow(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ans=a*pow(a, b-1);
    System.out.println(ans);
    }
}