package src.Genrics.Wildcards;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnBoundWildcards {
    /*
    Only <?> denotes the unbound wildcards in Generics that means there is no boundation in methods. Means method
    can accept every kind of value like (String, Integers, float, double)
     */
//    For example an unbound sort method
    public List<?> sortList(List list){
        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {
        UnBoundWildcards unBoundWildcards = new UnBoundWildcards();
        List<String> stringList = Arrays.asList("Jatin", "Happy", "Vivek", "Shubham", "Satish", "Bheem", "Karan");
        List<Integer> integerList = Arrays.asList(15,78,21,786,85,785,98,7458,7852);
        List<Double> doubleList = Arrays.asList(20.12,45.20,58.25,63.45,25.125,78.12);

        System.out.println("Sorted String list :" +unBoundWildcards.sortList(stringList));
        System.out.println("Integers String list :" +unBoundWildcards.sortList(integerList));
        System.out.println("Doubled String list :" +unBoundWildcards.sortList(doubleList));

    }
}
