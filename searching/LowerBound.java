import java.util.Scanner;

public class LowerBound {
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
        while(f<=l){
            int m=(l+f)/2;
            if(arr[m]==target) {
                System.out.println(m);
                break;
            }
            else if(target<arr[0]) {
                System.out.println(0);
                break;
            }
            else if(arr[m]<target){ 
                if (arr[m]<target && arr[m+1]>target ) {
                    System.out.println(m+1);
                    break;
                }
                else f=m+1;
            }
            else if(arr[m]>target) {
                if (arr[m]>target && arr[m-1]<target) {
                    System.out.println(m);
                    break;
                }else l=m-1;
            }
            else if(target>arr[n-1]) {
                System.out.println(n);
                break;
            }
        }
    }
}