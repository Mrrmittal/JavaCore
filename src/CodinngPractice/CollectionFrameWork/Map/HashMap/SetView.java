package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Write a Java program to create a set view of the mappings contained in a map.
public class SetView {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

//        Convert into set
        Set set = map.entrySet();
        System.out.println(set);
    }
}
