import java.util.*;//this problem is not in-place friendly because the insert will grow the string and loop never reaches the end condition
//therefore use new StringBuilder to store the result
public class CountAndSay{
    static StringBuilder countandsay(StringBuilder str){
        StringBuilder sb2=new StringBuilder();
        int i=0,count=0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;

            }
            else{
                sb2.append(count);
                sb2.append(str.charAt(i));
                i=j;
                j--;
                count=0;

            }
            if(i==str.length()-1 && j==str.length()-1){
                sb2.append(count);
                sb2.append(str.charAt(i));
            }
                
        }
        return sb2;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(countandsay(sb));

    }
}