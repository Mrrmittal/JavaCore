package src.LambdaExpression;

@FunctionalInterface
interface Practice2 {
    void sayHello();

    default void print(String name){
        System.out.println(name);
    }

    static int sum(int a, int b){
        return a+b;
    }
}


@FunctionalInterface
interface Practice1 extends Practice2{
    public void sayHello();
}
