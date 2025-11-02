import java.util.*;
public class CountPosNegZer {
    static int pos=0,neg=0,zer=0;
    public static void check(int n){
        if(n<0)
            neg++;
        else if(n==0)
            zer++;
        else
            pos++;

    }
    public static void main(String[] args) {
        char check='y';
        Scanner sc=new Scanner(System.in);
        while(check=='y'){
            System.out.println("Enter a number:");
            check(sc.nextInt());
            System.out.println("Continue?: [y/n]");
            check=sc.next().charAt(0);
        }
        System.out.println("The no of positives: "+pos+" ,negatives: "+neg+" ,zeros: "+zer);
    }
}
