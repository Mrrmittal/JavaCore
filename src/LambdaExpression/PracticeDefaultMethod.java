package src.LambdaExpression;



public class PracticeDefaultMethod{



    public static void main(String[] args) {
        Practice2 practice2 = () -> System.out.println("Hie");
        practice2.sayHello();

        practice2.print("Jatin");

        System.out.println(Practice2.sum(5,7));
    }

}
