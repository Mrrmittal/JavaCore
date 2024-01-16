package src.CollectionFramwork.Cursor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorCursor {
    /*
    Que: What is Iterator Cursor in java? Property Syntax and basic Demo.
    Sol: Iterator Cursor is the Type of Cursor in java. Helps to add, remove and retrieve element from the collection.

    #Syntax:
                Set set = new HashSet();
                Iterator itr = set.iterator();

     #Properties:

     1. Iterator is useful for all collection framework.
     2. But its restriction is, Its can only perform action like add, remove and read elements.
     3. Methods include hasNext(), next(), remove().
     4. Only can move in forward direction. Backward direction is not allowed.


     */

    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(12);
        set.add(25);
        set.add(78);
        set.add("Jatin");
        set.add("ABC");
        set.add("125Jatin");


        Iterator it = set.iterator();
        while (it.hasNext()){
            if(it.next().equals("ABC")){
                it.remove();
            }
        }
        System.out.println(set);

    }
}
