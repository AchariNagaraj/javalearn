import java.util.*;
public class Test {
    public static void main(String args[]){
        Set<List<Integer>> set=new LinkedHashSet<>();
        List<List<Integer>> matrix =new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(1,2,3)));
        matrix.add(new ArrayList<>(List.of(2,1,3)));
        matrix.add(new ArrayList<>(List.of(2,3,4)));

        List<List<Integer>> result=new ArrayList<>();// because we need to return List<List<Integer>>

        for(List<Integer> x:matrix){
            List<Integer> normalize=new ArrayList<>(x);//copy 
            Collections.sort(normalize);
            if(set.add(normalize)){// if not present the returns true else returns false
                result.add(x);
            }


        }
        for(List<Integer> x:result)
            System.out.println(x);


    }
}
