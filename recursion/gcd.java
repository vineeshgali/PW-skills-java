import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        print(a,b);
    }

    private static void print(int a, int b) {
        if(b%a==0){
            System.out.println(a);
            return;
        }
        print(b%a,a);
    }
}
