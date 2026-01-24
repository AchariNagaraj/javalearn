

public class Palindrome {
    static boolean checkPalindrome(StringBuilder sb){
        StringBuilder bs=new StringBuilder(sb.reverse());
        sb.reverse();
       return sb.toString().equals(bs.toString());
        
    }
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        System.out.println(checkPalindrome(sb));
    }
}
