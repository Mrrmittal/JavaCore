package src.StreamsPractice;

import java.util.Arrays;

public class SortElements {

    public int[] sortedArrayASC(int[] array){
        int[] arr = Arrays.stream(array).sorted().toArray();
        return arr;
    }

    public static void main(String[] args) {
        SortElements obj = new SortElements();
        int[] array = {1,1,23,34,55,34,5566,67,89,65,34,56,78};
        System.out.println(Arrays.toString(obj.sortedArrayASC(array)));
    }
}
