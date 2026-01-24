import java.util.*;

public class RemoveDigits {
    static StringBuilder remDig(StringBuilder str){
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                str.delete(i,i+1);
                i--;
            }

        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(remDig(sb));

    }
}
