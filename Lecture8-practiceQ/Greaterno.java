//package Lecture8-practiceQ;
import java.util.*;
public class Greaterno {
    public static int findGreater(int a,int b){
        if(a>b)
            return a;
        else if(b>a)
            return b;
        else{
            System.out.println("Both are equal");
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res=findGreater(sc.nextInt(), sc.nextInt());
        System.out.println(res);
    }
}
