package src.Genrics.Wildcards;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UpperBoundWildcards {
    /*
    UpperBound wildcards achieve the restriction on Generics typed method.
    Symbol (? extends Number> Number here is denoting the upperBound
     */

    public void addition(List<? extends Number> list){
        double sum = 0.0;
        for(Number i : list ){
            sum += i.doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        UpperBoundWildcards upperBoundWildcards = new UpperBoundWildcards();
        List<Integer> integerList = Arrays.asList(45,88,89,52,48,63);
        List<Double> doubleList = Arrays.asList(10.023,102.023,102.012,203.021,102.02,1025.02);
        List<Float> floatList =  Arrays.asList(15.12f,45.0f);

//        List<String> stringList = Arrays.asList("Abc", "Pqr");
//        upperBoundWildcards.addition(stringList);


        upperBoundWildcards.addition(integerList);
        upperBoundWildcards.addition(doubleList);
        upperBoundWildcards.addition(floatList);
    }
}
