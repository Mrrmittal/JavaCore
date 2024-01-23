package src.Genrics.Wildcards;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildcards {
    /*
    LowerBound Wildcards also help to set restriction on generics methods as to set at least their LowerBound
    restriction

    Symbol Collection_type <? super lower_bound>
     */

    public void printList(List<? super Integer> list){

        System.out.println(list);
    }

    public static void main(String[] args) {
        LowerBoundWildcards lowerBoundWildcards = new LowerBoundWildcards();
        List<Integer> integerList = Arrays.asList(45,88,89,52,48,63);
        List<Number> numbers = Arrays.asList(10.023,102.023,102.012,203.021,102.02,1025.02);
        List<Float> floatList =  Arrays.asList(15.12f,45.0f);


//        List<String> stringList = Arrays.asList("Abc", "Pqr");
//        lpperBoundWildcards.addition(stringList);


        lowerBoundWildcards.printList(integerList);
        lowerBoundWildcards.printList(numbers); // Only lowerBound and their super class can accept.
//        lowerBoundWildcards.printList(floatList);
    }
}
