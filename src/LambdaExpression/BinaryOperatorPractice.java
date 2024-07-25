package src.LambdaExpression;

//BinaryOperator<T> is just basically extend the BiFunction<T,U,R> interface
// means we can easily use BinaryOperator instead of BiFunction have all their generics type have same Inputs and
// as well as return type.

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {

        //I need to multiplication of 2 number and return their square

        //by using BiFunction<Integer,Integer,Integer>
        BiFunction<Integer,Integer,Integer> biFunction = (num1, num2) -> {
            Integer product = num1 * num2;
            return product * product;
        };

        //by using BinaryOperator<Integer>
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> {
          Integer product =  num1*num2;
          return product * product;
        };

        //call the function
        System.out.println("By using BiFunction<> : " +biFunction.apply(5,4));
        System.out.println("By using BinaryOperator<> : " +binaryOperator.apply(4,2));
    }
}
