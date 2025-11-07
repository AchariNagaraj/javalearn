
import java.util.*;
public class serachno {
    public static void main(String[] args) {

        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the number to search");
        int n=sc.nextInt();
        
        for(int i=0;i<size;i++){
            if(arr[i]==n){
                System.out.println("Number found at index:"+i);
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Not found");
    }
}
