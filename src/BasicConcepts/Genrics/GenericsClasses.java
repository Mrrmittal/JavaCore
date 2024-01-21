package src.BasicConcepts.Genrics;

import javax.swing.*;

public class GenericsClasses {

    /*
    Que: Define Generics Classes and How to create Generics Classes and why?
    Sol: Generics Classes are used while we need to type safe as well as flexible. Parameters need to used while
         Generating Generics classes. for example; we have a class box class with an Object container. if we declare
         as a String then we can only. String type of element can store. if we define like Object container then its
         does not be the type Safe.

      # Can be One Parameterized or Can be More than one Parameterized.

         But if we declare class generic we can make it dynamic as well as Type safe.
     */
    public static void main(String[] args) {
        Box<String,String> box1 = new Box("Water", "Cylinder"); // Need to declare <String>
        Box<Integer, String> box = new Box<>(789,"Cuboid");

        box1.store();
        System.out.println(box1.container.getClass().getName());

        box.store();
        System.out.println(box.container.getClass().getName());
    }
}

class Box<T,U>{
//    Property
    T container;
    U type;
//    Constructor
    Box (T container, U type){
        this.container = container;
        this.type = type;
    }

//    function
    public void store(){
        System.out.println("Item inside : " +container);
        System.out.println("Type is : " +type);
    }
}