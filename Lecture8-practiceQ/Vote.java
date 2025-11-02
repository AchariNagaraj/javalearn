//package Lecture8-practiceQ;
import java.util.*;
public class Vote {
    public static String eligibility(int age){
        if(age>=18){
            return "Eligible";

        }
        else 
        return "Not eligible";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String check=eligibility(sc.nextInt());
        System.out.println(check);
    }
}
