package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumberOfGivenList {

    public void filterEvenNumber(List<Integer> list){

        List<Integer> stream = list.stream().filter( a -> (a & 1) == 0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(stream);
    }


    public static void main(String[] args) {
        FilterEvenNumberOfGivenList obj = new FilterEvenNumberOfGivenList();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,14,25,25,32,43,43,5,56,56,7,7,843,232);
        obj.filterEvenNumber(list);
    }
}
