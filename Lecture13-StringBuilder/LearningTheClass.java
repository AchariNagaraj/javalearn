// package Lecture13-StringBuilder;

public class LearningTheClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        sb.setCharAt(0,'P');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        //delete substring delete(start,end);
        sb.delete(2,3);//goes till end minus one
        //append
        sb.append("Hello");
        System.out.println(sb);
        
    }
}
