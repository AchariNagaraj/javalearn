//Take input from user adn check if its an array sorted in ascending order
import java.util.*;
public class isAscneding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter array size");
        int[] a=new int[sc.nextInt()];

        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("False");
        }
        else
            System.out.println("True");

    }
}
