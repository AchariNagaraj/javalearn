package ExtraLearning;
import java.util.*;
public class StaircaseSearch {
    
    public static void main(String[] args) {
        int[][] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dimension of matrix row, col");
        int R=sc.nextInt();
        int C=sc.nextInt();
        arr=new int[R][C];
        System.out.println("Enter matrix elements");
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //This search can only be applied if the matrix is sorted row-wise and column-wise 
        System.out.println("Enter the target");
        int x=sc.nextInt();
        int row=R-1,col=C-1;
        int curr=arr[row][col];
        int flag=0;
        while(flag==0){
            if(x<curr)
                curr=arr[row][--col];
            else if(x>curr){
                curr=arr[++row][col];
            }
            else{
                flag=1;
                System.out.println("Element found at index ("+row+","+col+")");
            }
        }
        if(flag==0)
            System.out.println("not found");

        
            
    }
}
