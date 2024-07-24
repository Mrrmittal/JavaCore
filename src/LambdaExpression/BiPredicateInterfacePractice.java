package src.LambdaExpression;


import java.util.function.BiPredicate;

//BiPredicate is also a Functional Interface of Java 8 that is totally similar to Predicate Interface and
//But the only difference is its test(T t, U u) take two arguments and return boolean value.
public class BiPredicateInterfacePractice {
    public static void main(String[] args) {

        // Function to check is name length is equal to the given int value
        BiPredicate<String, Integer> biPredicate = (name, num) -> {
            return name.length() == num;
        };

        System.out.println(biPredicate.test("Jatin", 5));
    }
}
