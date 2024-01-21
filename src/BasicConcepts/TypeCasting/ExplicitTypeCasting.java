package src.BasicConcepts.TypeCasting;

public class ExplicitTypeCasting {
    /*
    Que: What is Explicitly (Narrow) Type Casting Concept in Java and its Types? Example of Using Type Casting.
    Sol: Explicitly or Narrow Type Casting both are same term. Its totally diff. or Opposite to the Implicit Type
         Casting, Because its does not occur naturally. We have to do explicitly.

        # When its Occur:
        1. Its occur at the time of target data type is smaller than the valued data type.
        2. It can produce compile error while do not type caste into relevant variable.
        3. Explicit Type casting is Unsafe, we might lose the data.

        #Types:
        1. Explicit UpCasting
        2. Explicit DownCasting

     */
    public static void main(String[] args) {
        //      Example to use Explicit Type Casting
        double a = 1456.58;
        System.out.println(a);

//      We need to cast double's type variable into int.
        int b = (int) a; //So, we need to Cast into (int) type.
        System.out.println(b); // So here we will lose the value after decimal.
    }
}
