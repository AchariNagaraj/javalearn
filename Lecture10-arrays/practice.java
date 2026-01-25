// to  check if the array is sorted in ascending order or not
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean isAscending= true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                isAscending=  false;
            if(isAscending==false){
                System.out.println("Not sorted in ascending order");
                break;
            }
        }
        if(isAscending)
            System.out.println("Sorted in  ascending order");

    }
}

