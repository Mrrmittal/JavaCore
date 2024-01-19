package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Write a Java program to copy all mappings from the specified map to another map.
public class CopyToAnother {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(45,"Yuvraj");

        map.putAll(map2);
        System.out.println(map);

    }
}
