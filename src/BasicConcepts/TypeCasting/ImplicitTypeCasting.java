package src.BasicConcepts.TypeCasting;

public class ImplicitTypeCasting {
    /*
    Que: What is Implicitly (Widening) Casting Concept in Java? Example of Using Type Casting.
    Sol: Implicitly Type Casting or Widening TypeCasting are Same term. and this kind of Type Casting naturally Occurs
         We do not need to do extra keyword or data_type.

      #  Its Only Occurs when:
      1. Target Data_type must be larger into their value.
      2. Both of them are Compatible to each Other.

         Double > Float > long > int > short > byte

     */
    public static void main(String[] args) {

//        int type's variable
        int a = 256;

//        We need to cast into double type.
        double b = a; //double type is larger than the int type.

        System.out.println(a); // Output will be : 256
        System.out.println(b); // Output will be : 256.0
    }

}
