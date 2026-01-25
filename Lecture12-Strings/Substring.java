import java.util.*;
public class Substring {

    static String CustomSubtring(String s,int bi,int ei){
        String subS="";
        for(int i=bi;i<=ei;i++){
            subS=subS+s.charAt(i);
        }
        return subS;
        
    }

    static int isPresent(String s, String subs){
        int j=0;
        int k;
        
        for(int i=0;i<s.length();i++){
            k=i;
            if(s.charAt(k)==subs.charAt(j)){
                k++;
               j++;
            }
            else{
                j=0;
            }
            if(j==subs.length()-1){
            return i;
            }
        }
        return -1;
        
    }
        
    

    public static void main(String args[]){
        String s1="Hello World";
        System.out.println(s1.substring(4,7));
        //endIndex will print till 6 (7-1)

        System.out.println(CustomSubtring(s1, 4, 6));
        //to check if substring is present
        System.out.println("Enter substring");
        Scanner sc=new Scanner(System.in);
        String subs=sc.nextLine();
        int res=isPresent(s1,subs);
        if(res>=0){
            System.out.println("substring found at index"+res);
        }
        else{
            System.out.println("not found");
        }

    }
}