public class Substring {

    static String CustomSubtring(String s,int bi,int ei){
        String subS="";
        for(int i=bi;i<=ei;i++){
            subS=subS+s.charAt(i);
        }
        return subS;
        
    }

    public static void main(String args[]){
        String s1="Hello World";
        System.out.println(s1.substring(4,7));
        //endIndex will print till 6 (7-1)

        System.out.println(CustomSubtring(s1, 4, 6));
    }
}