package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class FindMaximumAndMinimumValue {

    public static void findMaximumValue(List<Integer> list){
        int max = list.stream().max(Integer::compareTo).get();

        System.out.println(max);
    }


    public static void findMinimumValue(List<Integer> list){
        int max = list.stream().min(Integer::compareTo).get();
        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,14,25,25,32,43,43,5,56,56,7,7,843,232);
        findMaximumValue(list);
        findMinimumValue(list);
    }
}
