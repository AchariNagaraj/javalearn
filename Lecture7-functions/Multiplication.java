//package Lecture7-functions;
//function to multiply two numbers and return the product
import java.util.*;
public class Multiplication {
    public static int multiply(int a,int b){
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int prod=multiply(a, b);
        System.out.println("Product is:"+prod);
    }
}
