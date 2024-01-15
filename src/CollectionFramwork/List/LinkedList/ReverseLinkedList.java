package src.CollectionFramwork.List.LinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);

        //Iterate a linked List in reverse order
        for(int i=linkedList.size()-1; i>=0;i--){
            System.out.println(linkedList.get(i));
        }
    }
}
