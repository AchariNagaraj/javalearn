public class testPalindromicpat {
    public static void main(String[] args) {
        // int n=5;
        // for(int i=1;i<=5;i++){
        //     int l=i;
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         if(j==i)
        //         System.out.print("1 ");
        //         else if(j<i)
        //         System.out.print(l--+" ");
        //         else
        //         System.out.print(++l+" ");
        //     }
        //     System.out.println();
        // }


        //second appraoch
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
