package src.CollectionFramwork.Cursor;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {
    /*
    Que: What is IteratorList? How its Works and their properties?
    Sol: ListIterator is another type of cursor used by Java Collections frameworks. Applicable only on the List
         Interface.

     #Properties:
             1. Applicable only the List Interface.
             2. Forward and backward both direction are allowed in ListIterator.
             3. Can Remove, get, access, read, replace elements of the List Interface.
             4. Methods include like hasNext(), next(), remove(), replace(), hasPrevious(), previous(), set().

     */

    public static void main(String[] args) {
        List list = new LinkedList();

        list.add(122);
        list.add(1646);
        list.add(164);
        list.add(12234);
        list.add(122564);

        ListIterator itr = list.listIterator(list.size());
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}
