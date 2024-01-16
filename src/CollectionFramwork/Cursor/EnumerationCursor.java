package src.CollectionFramwork.Cursor;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Stack;

public class EnumerationCursor {
    /*
    Que: What is Enumeration Cursor? and there Properties?
    Sol: Enumeration cursor is the part of cursor in java. Also work like as another cursors.
         Introduction in version 1.0

     #Properties:-
     1. Only useful for legacy classes like (Vector and Stack)
     2. Introduce in JDK version 1.0.
     3. Only useful for read elements only. Not allow adding and removing.
     4. hasMoreElement() and nextElement() are two main method include.
     5. Does not allow backward direction implementation.

     */

    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.add("Jatin");
        stack.add(54);
        stack.add(541534);
        stack.add(54489);
        stack.add(543543);

        Enumeration itr = stack.elements();
        while(itr.hasMoreElements()){
            System.out.println(itr.nextElement());
        }
        stack.pop();
        System.out.println(stack);
        stack.push("Mittal");
        System.out.println(stack);
    }
}
