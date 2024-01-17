package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  Clone an array list to another array list
public class CloneArrayList {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();

        list1.add(12);
        list1.add(24);
        list1.add(36);
        list1.add(48);
        list1.add(60);
        list1.add(72);
        list1.add(84);

        List list2 = (ArrayList<Integer>) ((ArrayList<?>) list1).clone();
        System.out.println(list2);

    }
}
