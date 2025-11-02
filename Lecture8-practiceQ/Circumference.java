//package Lecture8-practiceQ;
import java.util.*;
public class Circumference {
    public static float calcCircumference(float n){
        return 2*3.142f*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float circ=calcCircumference(sc.nextFloat());
        System.out.println("The circumference is:"+circ);

    }
}
