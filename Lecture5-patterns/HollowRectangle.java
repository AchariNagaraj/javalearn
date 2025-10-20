// package Lecture5-patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        int r=5,c=5;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0||i==4||j==0||j==4)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.print("\n");
        }

    }
}
