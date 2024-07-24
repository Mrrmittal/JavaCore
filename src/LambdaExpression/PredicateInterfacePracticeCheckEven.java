package src.LambdaExpression;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfacePracticeCheckEven{
    public static void main(String[] args) {

        Predicate<Integer> predicate = (num) -> {
            if((num & 1) != 1)  return true;

            else return false;

        };

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for(int num : list){
            System.out.println(predicate.test(num));
        }
    }
}
