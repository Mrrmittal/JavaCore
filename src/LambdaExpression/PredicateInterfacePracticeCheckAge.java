package src.LambdaExpression;


// This is the practice class for using Predicate<T> functional Interface.
// Predicate Interface is basically an inbuilt Functional Interface in Java 8 that's have one abstract method name
// test(T t) and its take one argument and hold a condition and return true if condition is true.


import java.util.function.Predicate;

public class PredicateInterfacePracticeCheckAge {
    public static void main(String[] args) {

        // This is basically the implementation of using predicate interface
        Predicate<Integer> predicate = (age) -> {
          if(age >= 18){
              return true;
          } else {
              return false;
          }
        };

        //Now, call the predicate interface to test the  test() method;
        System.out.println(predicate.test(16));
    }

}
