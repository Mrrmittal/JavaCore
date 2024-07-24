package src.LambdaExpression;


//Consumer functional Interface practice class.
// Consumer is a Functional Interface in Java 8 that have one abstract method accept(T t) that accept one argument only
// and does not return anything.


import java.sql.SQLOutput;
import java.util.function.Consumer;

public class ConsumerInterfacePractice1 {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println(name);

        consumer.accept("Jatin");
    }
}
