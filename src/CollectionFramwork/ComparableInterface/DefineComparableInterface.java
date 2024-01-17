package src.CollectionFramwork.ComparableInterface;

import java.util.*;

public class DefineComparableInterface {
    /*
    Que: What is Comparable Interface in Java? and their properties and need.

    Sol: Comparable Interface help to compare two objects in java. While we need to compare two objects of a class in
         java we implement Comparable Interface.
         Comparable Interface have an compareTo() method which helps two compare object.

      #Need: Comparable Interface mostly use while sorting Objects of a class. For an example we have a student class
             so basically student have many properties like id, name, address. And we want to Sort students objects.
             so here, we need Comparable Interface to compare students class objects by specific Parameter like (id).

       #Properties of Comparable Interface

       # Only used in List Interface.
       1. Help to Compare objects of a class.
       2. compareTo() method.
       3. Can compare only using single parameter.
       4. if thisObject < anotherObject returns -ve value
       5. if thisObject = anotherObject returns Zero value
       6. if thisObject > anotherObject returns +ve value
       7. Comparable Interface present in java.lang package.
     */
    public static void main(String[] args) {

        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees(04,"Rahul", "IT"));
        employees.add(new Employees(05, "Vishal", "HR"));
        employees.add(new Employees(11, "Sunil", "IT"));
        employees.add(new Employees(21,"Mohan", "Finance"));
        employees.add(new Employees(03, "Reena", "HR"));

//       print employee set
        System.out.println(employees);

        System.out.println("*********************************************************88");

//        print in sorting by ID (compareTo() define in Employee Class)
        Collections.sort(employees);
        Iterator itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
