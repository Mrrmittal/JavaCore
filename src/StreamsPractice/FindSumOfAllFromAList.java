package src.StreamsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindSumOfAllFromAList {

    public Long sum(List<Integer> list){

        long stream = list.stream().mapToLong(n -> n).sum(); // mapToLong Function

        long stream2 = list.stream().reduce(0, (a,b) -> a+b); //using reduce function

        return stream2;
    }


    public static void main(String[] args) {
    FindSumOfAllFromAList obj = new FindSumOfAllFromAList();
        List<Integer> list = Arrays.asList(34,23,34,-12,34,67,23,56,67);
        System.out.println(obj.sum(list));

    }
}
