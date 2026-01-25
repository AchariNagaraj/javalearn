// package Lecture14.15-BitManipulation;

public class SetBit {
    public static void main(String[] args) {
    int n=5;
    int pos=1;//index (not the actual postion) //index=actual position -1
    int bitMask=1<<pos;
    int newNumber=bitMask|n;
    System.out.println(newNumber);
    }
}
