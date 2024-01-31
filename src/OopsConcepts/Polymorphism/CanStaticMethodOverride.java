package src.OopsConcepts.Polymorphism;
/*
We can declare static methods with the same signature in the subclass, but it is not considered overriding as there
won’t be any run-time polymorphism.
Hence, the answer is ‘No’.
If a derived class defines a static method with the same signature as a static method in the base class,
the method in the derived class is hidden by the method in the base class.
 */
class Parent{
    static void fun(){
        System.out.println("Parents fun");
    }

    public void fun(String name){
        System.out.println("Fun " +name );
    }
}
class Child extends Parent{
//    @Override (we can not Override the static method, because static method is hidden.)
    static void fun(){
        System.out.println("Child fun");
    }
}
public class CanStaticMethodOverride {
}
