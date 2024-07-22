package src.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class ForEachUsingLambda {


    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}
