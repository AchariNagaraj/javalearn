//package Lecture7-functions.homework;

//function to check if a number is prime or not 
//also handled 0,1,negatives
import java.util.*;
public class primeOrNot {
    public static void checkPrime(int n){
        int flag=0;
        if(n==1||n<=0)
        flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0){    
                flag=1;
                break;
            }    
        }
        if(flag==0)
            System.out.println("Prime");   
        else
            System.out.println("Not Prime");  
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        checkPrime(a);
    }
}
