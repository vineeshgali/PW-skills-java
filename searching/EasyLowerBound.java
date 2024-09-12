import java.util.Scanner;

public class EasyLowerBound{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int f=0;
        int l=n-1;
        int lower=n;
        while (f<=l) { 
            int m=(l+f)/2;
            if(arr[m]>=target){
            lower = Math.min(lower, m);
            l=m-1;
            }else{
                f=m+1; 
            }      
        }
        System.out.println(lower);
   }
}