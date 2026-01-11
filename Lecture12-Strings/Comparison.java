// package Lecture12-Strings;
import java.util.*;
public class Comparison {
    public static void main(String args[]){
        //we are using compareTo() function
        //if s1 > s2 -> +ve val
        //if s1 == s2 -> 0
        //if s1 < s2 -> -ve val
        //hello < wello 
        //hello > cello
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println("Same name");
        }
        else if(name1.compareTo(name2)<0){
            System.out.println("Name 2 is greater ");
        }
        else{
            System.out.println( "Name 1 is greater ");
        }
    }
}
