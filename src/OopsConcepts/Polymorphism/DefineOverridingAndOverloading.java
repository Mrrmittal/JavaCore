package src.OopsConcepts.Polymorphism;
/*
Overriding: Overriding is a feature of OOP languages like Java that is related to run-time polymorphism.
A subclass (or derived class) provides a specific implementation of a method in the superclass (or base class).
The implementation to be executed is decided at run-time and a decision is made according to the object used for
the call. Note that the signatures of both methods must be the same. Refer to Overriding in Java for details.

Overloading: Overloading is also a feature of OOP languages like Java that is related to compile-time (or static)
polymorphism. This feature allows different methods to have the same name, but different signatures, especially
the number of input parameters and type of input parameters.
 */

class A{
    public void print(){
        System.out.println("Hello");
    }

    public void print(String name){
        System.out.println("Print name");
    }

    public void print(int num){
        System.out.println("Print number");
    }
    /*
    We can easily make many methods with the same name but different signature, this concept is know as overloading
    (Compile time polymorphism)
     */
}

class B extends A{
    @Override
    public void print(){
        System.out.println("Child print");
    }

    @Override
    public void print(String name){
        System.out.println("Child name print");
    }

    /*
    Child class can Override all same methods present in the parents class.
     */
}
public class DefineOverridingAndOverloading {
}
