package src.CollectionFramwork.List.Arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplication {

    //function to remove elements from arraylist
    public void removeDuplicate(ArrayList arrayList){
//        We can only remove element from an arraylist to convert into set(because set collection of unique elements)
        Set set = new LinkedHashSet(arrayList);
        System.out.println(set);
    }

    public static void main(String[] args) {
        RemoveDuplication myObj = new RemoveDuplication();
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(100);
        a1.add(10);
        a1.add(10);
        a1.add(20);
        a1.add(10);

        myObj.removeDuplicate(a1);

    }
}
