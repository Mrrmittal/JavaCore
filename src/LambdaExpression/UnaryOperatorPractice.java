package src.LambdaExpression;

// UnaryOperator<T t> just basically extend Function<R r, T t> interface.
// means if Function<String, String> interface have same Input and return type then we can just use UnaryOperator
// instead of using Function<> interface


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {
        //I need to return square of a number

        // by using Function<> interface
        Function<Integer,Integer> function = (num) -> num * num;

        //we can operate it by using UnaryOperator<> because Function have both same input and return type
        UnaryOperator<Integer> unaryOperator = (num) -> num*num;

        //call both
        System.out.println("By using Function<> : " +function.apply(5));
        System.out.println("By using UnaryOperator<> : " +unaryOperator.apply(4));
    }
}
