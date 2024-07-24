package src.LambdaExpression;

//This is class for practice Function<R,T> Interface of Java 8 Functional Interface.
// Function<R,T> have two Generics typed Interface, there R for the "input" type and T for the output type.
// And in this Functional Interface there is a method R apply(T t) present.

import java.util.function.Function;

public class FunctionInterfacePractice1 {
    public static void main(String[] args) {

        // I need a practice to return length of the name of a Person
        Function<String, Integer> function = name -> {
            return name.length();
        };

        System.out.println(function.apply("Jatin"));
    }


}
