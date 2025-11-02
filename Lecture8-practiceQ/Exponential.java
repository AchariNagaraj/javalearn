import java.util.*;
import java.math.*;
public class Exponential {
    public static void findExp(int x,int n){
        // double res=Math.pow(x, n);
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*x;
        }
        System.out.println(x+" raised to "+n+" is "+res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and exponent");
        findExp(sc.nextInt(),sc.nextInt());

    }
}
