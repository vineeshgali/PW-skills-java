import java.util.*;
public class Stairpath {

    public static int Stair(int n){
        if(n<=2) return n;
        int ans=Stair(n-1)+Stair(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Stair(n));
    }
}
