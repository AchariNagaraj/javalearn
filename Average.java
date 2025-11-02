//Enter three no from user and use a function to find their average
import java.util.*;
public class Average {
    public static float findAverage(float a,float b,float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three no:");
        float res=findAverage(sc.nextFloat(), sc.nextFloat(),sc.nextFloat());
        System.out.println("Average is:"+res);
    }
}
