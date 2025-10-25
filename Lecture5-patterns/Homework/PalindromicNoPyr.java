// package Homework;

public class PalindromicNoPyr {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int l=i;
            for(int j=1;j<=2*i-1;j++){
                
                if(j==i)
                System.out.print("1");
                if(j<i)
                System.out.print(l--);
                if(j>i)
                System.out.print(++l);
            }
            System.out.println();
        }
    }
}
