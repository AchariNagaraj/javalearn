// package Lecture12-Strings;
import java.util.*;
public class Concatenation {
    static String concatenate(String s1,String s2){
        return s1+s2;
    }
    public static void main(String args[]){
        System.out.println("Enter string 1");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Enter string 2 ");
        String s2=sc.nextLine();
        System.out.println("Concatenated string "+concatenate(s1, s2));

    }
}
