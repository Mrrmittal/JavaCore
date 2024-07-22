package src.LambdaExpression;

import java.util.*;

public class ComparatorInterfaceUsingLambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(11);
        list.add(-1);
        list.add(15);
        list.add(-54);
        list.add(51);

        // TreeSet is already sorted. so, we can only add the sorting order as per the comparator
        Set<Integer> treeSet = new TreeSet<>((a,b) -> b - a);
        treeSet.add(1);
        treeSet.add(-12);
        treeSet.add(13);
        treeSet.add(-41);
        treeSet.add(10);

        //Sorting Reverse order by using lambda Expression.
        Collections.sort(list, (a,b) -> b - a);

        System.out.println(list);
        System.out.println(treeSet);
    }
}
