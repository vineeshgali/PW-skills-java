import  java.util.*;
public class arraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        sorted(arr,0,1);
    }

    private static void sorted(int[] arr,int i,int j) {
        if(j==arr.length-1) return;
        boolean flag= arr[i] < arr[j];
        sorted(arr,j,j+1);
        if(flag) System.out.println("sorted");
        else System.out.println("not sorted");
    }
}
