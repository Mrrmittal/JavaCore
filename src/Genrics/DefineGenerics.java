package src.Genrics;


import java.util.ArrayList;
import java.util.List;

public class DefineGenerics {
    /*
    Que: What is Generics ? Need, Properties and types of Generics? Define an example.
    Sol: Generics basically helpful for providing Type-Safety to objects in java. Like primitive data types variables
         Arrays in Java are totally Type safe, Because while we have to create these variable we can store a single
         typed data in it.

         But what about Collections. Before Java 5.0 Collection is Totally types unsafe in java. We can add String,
         Integers as well boolean Value can be store in Collections. But Generics help to provide Type Safety to the
         collection. We can make a collection which only allow a Type Safe element/Object in the collection.

       #Syntax:
                List<String> list = new ArrayList<>();

                <> This Symbols helps to achieve concepts of Generics.

       #Need: Most and basic need of Generics is makes Object Type Safe.


       #Types of Generics Class :
       1. Generics Classes.
       3. Generics Methods.

     */
    public static void main(String[] args) {
//        Example of Generics

        List list = new ArrayList<>();
        list.add(45); //Integers Type
        list.add("ABC"); //String Type
        list.add(52.56); //double type
        System.out.println(list); //Here list can allow all value in the collection that is Totally Unsafe.

//        Generic (Type safe) list
        List<String> list1 = new ArrayList<>();
        list1.add("Abc"); //String Type
//        list1.add(78); // Integers type now allowed. Compile Time error
//        list1.add(89.90); Compile Time error only allow String element
        System.out.println(list1);


    }
}
