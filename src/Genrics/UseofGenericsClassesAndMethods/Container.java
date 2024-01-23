package src.Genrics.UseofGenericsClassesAndMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Container<T> {

    public <T> void sort2(List list){
        Collections.sort(list);
        System.out.println(list);
    }

    public static void main(String[] args) {
        Container<String> stringContainer = new Container();
        Container<Integer> integerContainer = new Container();
        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add("Jatin");
        list.add("Divya");
        list.add("Dharam");
        list.add("Kapil");

        list1.add(125);
        list1.add(256);
        list1.add(78);
        list1.add(789);
        list1.add(4545);


        stringContainer.sort2(list);
        integerContainer.sort2(list1);

    }
}
