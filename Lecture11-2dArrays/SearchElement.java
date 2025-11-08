import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int[][] a=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element to be searched:");
        int n=sc.nextInt();
        int found=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(a[i][j]==n){
                    System.out.println(i+","+j);
                    found=1;
                }
            }
        }
        if(found==0)
            System.out.println("not found");
    }
}
