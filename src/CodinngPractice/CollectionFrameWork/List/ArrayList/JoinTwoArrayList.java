package src.CodinngPractice.CollectionFrameWork.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Join two array lists
public class JoinTwoArrayList {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();

        list1.add(12);
        list1.add(24);
        list1.add(36);
        list1.add(48);
        list1.add(60);
        list1.add(72);
        list1.add(84);

        List list2 = new ArrayList<>();

        list2.add(12);
        list2.add(24);
        list2.add(36);
        list2.add(60);
        list2.add(84);
        list2.add(60);
        list2.add(72);

//        Join two ArrayList
        List list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        Collections.sort(list3);
        System.out.println(list3);
    }
}
