package src.CollectionFramwork.List.LinkedList;

import java.util.LinkedList;

public class Insertion {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);

        linkedList.add(3,700);
        System.out.println(linkedList);


    }
}
