package src.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceWithoutUsingLambdaExpression implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b){
        // for descending order
        return b-a;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(11);
        list.add(-1);
        list.add(15);
        list.add(-54);
        list.add(51);


        //Sorting in descending order.
        Collections.sort(list, new ComparatorInterfaceWithoutUsingLambdaExpression());

        System.out.println(list);
    }

}
