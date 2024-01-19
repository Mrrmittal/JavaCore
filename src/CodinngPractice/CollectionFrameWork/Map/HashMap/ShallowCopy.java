package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Write a Java program to get a shallow copy of a HashMap instance.
public class ShallowCopy {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

        HashMap map1 = new HashMap<>();
        map1 = (HashMap)map.clone();

        System.out.println(map);
        System.out.println(map1);
    }
}
