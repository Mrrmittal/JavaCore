package src.InnerClasses;

/*
Que : What is inner classes ? What is the advantages to use inner classes in Java?
Sol : Basically we can say inner classes is nested classes in java or in the simple words we can say that inner
      classes is the interior classes of a class.

      Some Advantages to introduce inner classes in java:-
   1.) Increase the functionality of encapsulation in the classes.
   2.) Makes code more clean and readable.
   3.) Optimize the code module.

Que : can we use access modifier while creating an inner class?
Sol: Yes, for sure you can use keywords like private, protected, default while using an inner class.

#Types of inner classes :
1) nested inner class.
2) Anonymous inner class.
3.) method local inner class.
 */

public class DefineInnerClasses {

    private int num = 7; //private instance variable
//    Inner class
    class MyInner{
        public void print(){
            System.out.println("Num is : " +num); // Inner class is also a member of DefineInnerClass for here we
                                                  // cam access the private member.
        }
    }

    public static void main(String[] args) {
        DefineInnerClasses.MyInner obj  = new DefineInnerClasses(). new MyInner();
        obj.print();
    }
}
