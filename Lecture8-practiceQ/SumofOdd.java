//write a function to print sum of all odd numbers from 1 to n

import java.util.Scanner;

public class SumofOdd {
    public static int sumOfOdd(int n){
        if(n<0)
        System.out.println("Please input a positive number");
        int sum=0;
        for(int i=1;n<0?i>=n:i<=n;i++){
            if(i%2!=0)
                sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res=sumOfOdd(sc.nextInt());
        System.out.println("The sum is:"+res);
    }
}
