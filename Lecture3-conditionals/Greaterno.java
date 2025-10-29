//package Lecture3;
import java.util.*;
public class Greaterno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no");
        int a=sc.nextInt();
        System.out.println("Enter second no");
        int b=sc.nextInt();
        if(a==b)
            System.out.println("Equal");
        else if(a>b)
            System.out.println(a+" is greater");
        else
            System.out.println(b+" is greater");

    }
}
