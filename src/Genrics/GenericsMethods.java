package src.Genrics;

import java.util.List;

public class GenericsMethods {
    /*
    Que: Define Generics Methods and How to create Generics Classes and why?
    Sol: Generics Methods helps to reuse a methods who can accept Every kind of datatype. Its provide flexibility to use
         only a single method for every kind of data type parameter. Helps to provide reuse-ability of a method.

         For eg:
         // a method
         public void display(String s) {
         System.out.println(s);
         }

         This method can only accept String value.
         But if continue this same operation with Integers value we need to generate another method for Integers type.

        So, Generics help us to generate only a single methods for all data types.
     */
//    Example for a generics method is:
    public static  <T> T display(T obj){        // "T" here is trying to support Generic Type
        return obj;                           // Return Object
    }


    public static void main(String[] args) {
        System.out.println("Name is :" +display("Jatin"));
        System.out.println("Age is :" +display(22));
    }
}

// So basically while we need to call same method for many type of data we use the concepts of generics methods.