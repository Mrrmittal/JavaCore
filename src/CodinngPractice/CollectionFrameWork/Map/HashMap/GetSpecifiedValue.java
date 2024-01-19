package src.CodinngPractice.CollectionFrameWork.Map.HashMap;

import java.util.HashMap;

//Write a Java program to get the value of a specified key in a map.
public class GetSpecifiedValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(7, "MSD");
        map.put(18, "VK");
        map.put(100, "KL");
        map.put(10,"ST");
        map.put(3,"Raina");

        String a = String.valueOf(map.get(3));
        System.out.println(a);
    }
}
