package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to check whether a map contains key-value mappings (empty) or not.
public class CheckEmpty {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

        if(map.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }
}
