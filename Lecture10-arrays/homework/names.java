import java.util.*;
public class names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of names");
        int size=sc.nextInt();
        sc.nextLine();                // consume the left over '\n' in the buffer, otherwise the first element will be "" because readline() reads till "\n"
        String[] names=new String[size];
        System.out.println("Enter names");
        for(int i=0;i<names.length;i++){
            names[i]=sc.nextLine();// or i could use sc.next() which automatically skips the whitespaces and reads only a single token(word)
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }

}
