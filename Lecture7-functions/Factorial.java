//package Lecture7-functions;
//fucntion to find factorial of a number 

import java.util.*;
public class Factorial {
    public static int factorial(int n){
        int fact=1;
        if(n<0)
            System.out.println("Invalid number");
        
        // for(int i=n;i>=1;i--){
        //     fact=fact*i;
        // }

        while(n>1){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int fact=factorial(a);
        System.out.println("Factorial is:"+fact);
    }
}
