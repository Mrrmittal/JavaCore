package src.CollectionFramwork.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationOnHashSet {
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

        Iterator it = set.iterator();{
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
