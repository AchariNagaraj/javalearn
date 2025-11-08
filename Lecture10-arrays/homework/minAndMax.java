public class minAndMax {
    public static void main(String[] args) {
        //first approach
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // int arr[]={2,3,4,1,6,5};
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<min)
        //         min=arr[i];
        //     if(arr[i]>max)
        //         max=arr[i];
        // }
        // System.out.println("MIN and MAX are: "+min+" "+max);
        


        //second appraoach
        // int[] arr={2,3,4,1,6,5};
        // int min=arr[0], max=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]<min)
        //         min=arr[i];
        //     if(arr[i]>max)
        //         max=arr[i];
            
        // }
        // System.out.println("MIN and MAX are: "+min+" "+max);


        //third approach
        int[] a={2,3,4,1,6,5};
     
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("MIN and MAX are: "+min+" "+max);







    }
}
