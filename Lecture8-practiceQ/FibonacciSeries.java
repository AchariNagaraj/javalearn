//fibonacci series of n terms
import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        if(n==1)
        System.out.println(a);
        else if(n==2)
        System.out.println(a+"\n"+b);
        else{
            System.out.println("The fibonacci series of "+n+" terms is:");
            System.out.println(a+"\n"+b);
            for(int i=3;i<=n;i++){
                c=a+b;
                System.out.println(c);
                a=b;
                b=c;
            }
        }
    }
}
