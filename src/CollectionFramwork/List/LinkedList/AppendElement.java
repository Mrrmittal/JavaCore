package src.CollectionFramwork.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AppendElement {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(100);
        linkedList.add(45);
        linkedList.add(102);
        linkedList.add(789);

        System.out.println(linkedList);

//        With using iteration
        Iterator iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //    Iterate at specified Position
        for(int i= 2;i < linkedList.size(); i++ ){
            System.out.println(linkedList.get(i));
        }


    }


}
