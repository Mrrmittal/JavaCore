package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class FindDistinctElement {


    public void findDistinct(int[] array){

        int[] list = Arrays.stream(array).distinct().toArray();
        System.out.println(Arrays.toString(list));
    }


    public static void main(String[] args) {
        FindDistinctElement obj = new FindDistinctElement();
        int[] array = {1,1,23,34,55,34,5566,67,89,65,34,56,78};
        obj.findDistinct(array);
    }
}
