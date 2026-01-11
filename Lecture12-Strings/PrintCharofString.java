// package Lecture12-Strings;
import java.util.*;

public class PrintCharofString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String food="Chicken Biryani";
        for(int i=0;i<food.length();i++){
            System.out.println(food.charAt(i));
        }
    }
}
//conclusion 
// we can get specific character of a string if the index is provided