import java.util.*;
// package Lecture14.15-BitManipulation;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=1;
        int upd=sc.nextInt();
        int bitMask=1<<pos;
        int newNumber;
        if(upd==1){
            //set bit
            newNumber=bitMask | n;
        }
        else{
            int newBitMask=~bitMask;
            newNumber=newBitMask& n;
        }
        System.out.println(newNumber);
    }
}
