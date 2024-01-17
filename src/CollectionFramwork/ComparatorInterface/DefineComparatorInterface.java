package src.CollectionFramwork.ComparatorInterface;

import src.CollectionFramwork.ComparableInterface.Employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DefineComparatorInterface {
    /*
    Que: What is Comparator Interface? Need and properties.
    Sol: Comparator Interface help to compare two object of a class. And helps us to sort these objects by their
         properties.like the Comparable Interface. But the main drawback of Comparable class is that we can compare
         objects by only one parameter like id, name etc. But Comparator Interface helps us to solve problem of
         Comparable Interface. We can Compare objects with different-different parameter.

      #Need: Comparator Interface mostly use while sorting Objects of a class. For an example we have a student class
             so basically student have many properties like id, name, address. And we want to Sort students objects.
             so here, we need Comparator Interface to compare students class objects by specific Parameter like (id).
             Same like as Comparable Interface but here in Comparator Interface we can compare with diff-diff
             Multiple property.

       #Properties of Comparable Interface

       # Only used in List Interface.
       1. Help to Compare objects of a class.
       2. compareTo() method.
       3. Can compare using Multiple parameter.
       4. if thisObject < anotherObject returns -ve value
       5. if thisObject = anotherObject returns Zero value
       6. if thisObject > anotherObject returns +ve value
       7. Comparator Interface present in java.util package.
     */


    public static void main(String[] args) {
        List<Employees> employees1 = new ArrayList<Employees>();

        employees1.add(new Employees(23, "Mohit" ,"IT"));
        employees1.add(new Employees(14, "Rohit" ,"HR"));
        employees1.add(new Employees(16, "Rohan" ,"Finance"));
        employees1.add(new Employees(18, "Sonu" ,"Sales"));
        employees1.add(new Employees(10, "Monu", "Marketing"));
        employees1.add(new Employees(29, "Divya" ,"Purchase"));
        employees1.add(new Employees(27, "Deepti" ,"Admin"));


//    Sort By name

        Collections.sort(employees1, new SortByName());
        Iterator itr = employees1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("***************************");
//        Sort By Department
        Collections.sort(employees1, new SortByDepartment());
        Iterator itr2 = employees1.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("***************************");
//        Sort By ID
        Collections.sort(employees1,new SortById());
        Iterator itr3 = employees1.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("***************************");


    }
}
