import java.util.Scanner;

public class Maze {
    public static int ways(int row,int col,int n,int m){
        if(row==n||col==m) return 1;
        int rowways= ways(row,col+1,n,m);
        int colways= ways(row+1,col,n,m);
        return rowways+colways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(ways(1,1,n,m));
    }
}
