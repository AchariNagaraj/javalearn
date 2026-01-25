//package Lecture7-functions;
//funtion to add two numbers and return the sum
import java.util.*;
public class Sum {
    public static int sum(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println("Sum is: "+sum);
    }
}
