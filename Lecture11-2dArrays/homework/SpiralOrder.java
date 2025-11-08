//print spiral order in a 2d matrix
import java.util.*;
public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and cols");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] a=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int size=a.length*a[0].length;
        int count=0;
        int i=0,j=0;
        int k=0;//limit while increasing 
        int l=0;//limit while decreasing
        try{
            while(count<=size){
                for(;j<cols-1-k;j++){//loop till second last element in the row
                    if(count>size)break;
                    System.out.println(a[i][j]);
                
                    count++;
                    
                }
                for(;i<rows-1-k;i++){//same
                    if(count>size)break;
                        
                    System.out.println(a[i][j]);
                    count++;
                }
                for(;j>l;j--){
                    if(count>size)break;
                        
                    System.out.println(a[i][j]);
                    count++;

                }
                for(;i>l;i--){
                    if(count>size)break;

                    System.out.println(a[i][j]);
                    count++;
                }
                if(i==rows/2 && j==cols/2 && count==size-1){//print last no(center one) 
                    
                    System.out.println(a[i][j]);

                    break;
                }
                i++;
                j++;
                l++;
                k++;
                
            }
        }
        catch(Exception e){
            System.out.println("The array size is even");
        }

//i coded it , it is approximately proper because it throws array index out of bound error if the size is even
    }
}
// ill push the improvised version in next file

