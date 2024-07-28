package src.LambdaExpression;

import java.util.function.Function;

public class MethodReferenceTest {



    public static void main(String[] args) {
        //need to return length of String
        Function<String, Integer> function = (MethodReferenceTest::apply);
        System.out.println(function.apply("Jatin"));
    }

    static Integer apply(String name){
        return name.length();
    }
}
