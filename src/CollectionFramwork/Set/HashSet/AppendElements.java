package src.CollectionFramwork.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class AppendElements {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("Yellow");
        set.add("Pink");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Red");
        set.add("Purple");
        set.add("Blue");
        set.add("Blue"); //Duplicate elements not allowed in HashSet.

        System.out.println(set);


    }
}
