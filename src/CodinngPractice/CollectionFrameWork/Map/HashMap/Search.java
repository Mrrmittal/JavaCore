package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.HashMap;

// Write a Java program to test if a map contains a mapping for the specified key.
public class Search {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

        if(map.containsKey(19)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
