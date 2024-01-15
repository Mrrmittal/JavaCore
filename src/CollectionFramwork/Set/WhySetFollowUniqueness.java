package src.CollectionFramwork.Set;

import java.util.HashSet;
import java.util.Set;

public class WhySetFollowUniqueness {
    /*
    Sets follow Uniqueness, Because Object class methods equals are the good friend of Set Class and works for check and
    Compare the elements. So, equal method does not allow to add same content method into the Set interface.
     */

    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(55);
        set.add("Hello");
        set.add(55);
        System.out.println(set);

//    But we see above example is that set is also not follow Sequence. Let's discuss in next que.
    }
}
