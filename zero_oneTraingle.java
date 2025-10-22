public class zero_oneTraingle {
    public static void main(String[] args) {
        int n=5;
        int ind=1;
        for(int i=1;i<=n;i++){
            int flag=ind;
            for(int j=1;j<=i;j++){
                System.out.print(flag+" ");
                flag=(flag==1)?0:1;
            }
            ind=(ind==1)?0:1;
            System.out.println();
        }
    }
}
