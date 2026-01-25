//package Lecture7-functions.homework;
import java.util.*;
public class EvenOrNot {
    public static void checkEven(int n){
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        checkEven(sc.nextInt());

        
    }
}
