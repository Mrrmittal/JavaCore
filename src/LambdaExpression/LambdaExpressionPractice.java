package src.LambdaExpression;


@FunctionalInterface
interface Sum{

    public int sumNumber(int a, int b);
}

public class LambdaExpressionPractice{
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        Sum num = (a,b) ->{
            return a+b;
        };

        Sum num2 = (a,b) -> a+b;

        System.out.println(num.sumNumber(x,y));
        System.out.println(num2.sumNumber(100,200));


    }
}
