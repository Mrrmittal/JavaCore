package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListIntoUpperCase {

    public static String convert(List<String> list){

        List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        return list1.toString();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hie", "bye");
        System.out.println(convert(list));
    }
}
