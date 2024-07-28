package src.StreamsPractice;

// Write a program to return the sum of collection.

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPractice1 {
    public static void main(String[] args) {
        int[] nums = {3,5};
        long sum1 = Arrays.stream(nums).mapToLong(n -> n).sum();

        long sum2 = Arrays.stream(nums).reduce(0, (a,b) -> a+b);

        System.out.println(sum1);
        System.out.println(sum1);
    }
}
