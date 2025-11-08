import java.util.*;
public class SpOrderImproved {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] a=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int rstart=0,cstart=0;
        int rend=rows-1;
        int cend=cols-1;
        while(rstart<=rend && cstart<=cend){
            for(int j=cstart;j<=cend;j++)
                System.out.println(a[rstart][j]);
            rstart++;

            for(int i=rstart;i<=rend;i++){
                System.out.println(a[i][cend]);
            }
            cend--;

            for(int j=cend;j>=cstart;j--)
                System.out.println(a[rend][j]);
            rend--;

            for(int i=rend;i>=rstart;i--)
                System.out.println(a[i][cstart]);
            cstart++;
        }
    }
}
//it works but not my code ;(