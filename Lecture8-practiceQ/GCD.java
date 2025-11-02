//Find GCD of two numbers (i also found lcm)
import java.util.*;
public class GCD {
    public static int findGCD(int a,int b){
        int gcd=1;
        for(int i=1;i<=(a>b?b:a);i++){
            if(a%i==0 && b%i==0)
                gcd=i;
            
        }
        return gcd;
    }
    public static int findLCM(int a,int b,int gcd){
        return a*b/gcd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nos:");
       
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=findGCD(a, b);
        int lcm=findLCM(a,b,gcd);
        System.out.println("The gcd is: "+gcd+" and the LCM is "+lcm);
        

    }
    
}
