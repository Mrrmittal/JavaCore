package src.BasicConcepts.TypeCasting;

public class DefineTypeCasting {
    /*
    Que: What is Type Casting Concept in Java? How many types of TypeCasting in Java? Example of Using Type Casting
    Sol: TypeCasting is Basically process to Convert one primitive type data into another primitive type data by using
         Casting Operator. When you assign another data type value into another primitive data type is Know as Type
         Casting.

         Type of Type Casting:-
         1. Implicitly Type Casting.
         2. Explicitly Type Casting.

        Syntax: <data_type> var_name = (<typecasting_dataType>) value;

     */
    public static void main(String[] args) {
//      Example to use Type Casting
        double a = 1456.58;
        System.out.println(a);

//      We need to cast double's type variable into int.
        int b = (int) a; //So, we need to Cast into (int) type.
        System.out.println(b); // So here we will lose the value after decimal.
    }
}
