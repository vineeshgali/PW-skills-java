import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int target=sc.nextInt();
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            boolean flag=false;
            int first=0;
            int last=n-1;
            while(first<=last){
                int mid=(first+last)/2;
                if(arr[mid]<target){
                    first=mid+1;
                }
                else if(arr[mid]>target){
                    last=mid-1;
                }
                else if(arr[mid]==target){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
