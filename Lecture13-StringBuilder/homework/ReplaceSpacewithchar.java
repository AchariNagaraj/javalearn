import java.util.*;
// package Lecture13-StringBuilder.homework;

public class ReplaceSpacewithchar {
    static StringBuilder rep(StringBuilder str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){//replace
                str.setCharAt(i,'%');
                str.insert(i+1,'2');
                str.insert(i+2,'0');
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(rep(sb));
    }
}
