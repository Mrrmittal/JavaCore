package src.CodinngPractice.CollectionFrameWork.Map.HashMap;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Write a Java program to remove all mappings from a map.
public class RemoveAllMapping {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

        map.clear();
        System.out.println(map);
    }
}
