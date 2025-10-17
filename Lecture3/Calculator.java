// package Lecture3;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operator: + - * / %"); 
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+': System.out.println(a+b);break;
            case '-': System.out.println(a-b);break;
            case '*': System.out.println(a*b);break;
            case '/': if(b!=0)System.out.println(a/b);
                        else System.out.println("Cant divide by zero");break;
            case '%': if(b!=0)System.out.println(a%b);
                        else System.out.println("Cant divide by zero");break;
            default: System.out.println("Invalid operator");
        }
    }
    
}
