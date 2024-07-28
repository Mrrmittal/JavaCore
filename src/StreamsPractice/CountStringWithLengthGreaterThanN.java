package src.StreamsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CountStringWithLengthGreaterThanN {

    public int countString(String[] strings, int n){
        long count = Arrays.stream(strings).filter(a -> a.length() >= n).count();

        return (int)count;
    }


    public static void main(String[] args) {
        CountStringWithLengthGreaterThanN obj = new CountStringWithLengthGreaterThanN();
        String[] strings = {"Jatin Mittal", "Hello", "Bye", "gja", "kagfhj", "kgasjkh"};
        int n = 5;
        System.out.println(obj.countString(strings, n));
    }
}
