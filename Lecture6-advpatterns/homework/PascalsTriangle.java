public class PascalsTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                float c=1;
                if(j!=0){
                    for(int k=0;k<j;k++){
                        c=(float)c*(i-k)/(j-k);
                    }
                }
                System.out.printf("%.0f ",c);
            }
            System.out.println();
        }

    }
}
