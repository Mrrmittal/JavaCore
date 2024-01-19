package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

// WAP to add element in HashMap
public class AddingElement {
    public static void main(String[] args) {
        Map map = new HashMap<>();

        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

//        Print maps element
        System.out.println(map);

//        Size of the hashMap
        int size = map.size();
        System.out.println("Size of my map is :" +size);
    }
}
