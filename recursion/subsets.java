import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        subset(0,str,"");
    }

    private static void subset(int i,String str,String ans) {
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        subset(i+1,str,ans+(str.charAt(i)));
        subset(i+1,str,ans);
    }
}
