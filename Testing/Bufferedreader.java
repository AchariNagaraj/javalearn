import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=b.readLine())!=null && !str.isEmpty()){
            System.out.println(str);
        }
    }
}
