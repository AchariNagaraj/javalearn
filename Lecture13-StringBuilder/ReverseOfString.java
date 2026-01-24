// package Lecture13-StringBuilder;
import java.util.*;

public class ReverseOfString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        int n=sb.length()-1;
        for(int i=0;i<=sb.length()/2;i++){
            int front=i;
            int back=n-i;
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
