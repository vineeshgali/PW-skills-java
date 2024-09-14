import java.util.*;
public class NStairpath {

    public static int Stair(int n){
        if(n<=2) return 1;
        if(n==3) return 2;
        int ans=Stair(n-1)+Stair(n-3);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Stair(n));
    }
}
