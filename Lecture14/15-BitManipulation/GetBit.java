// package Lecture14.15-BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if((n & bitMask) == 0){
            System.out.println("bit was zero");
        }
        else
            System.out.println("bit was one");
    }
}
