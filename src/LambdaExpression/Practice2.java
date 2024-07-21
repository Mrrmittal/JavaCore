package src.LambdaExpression;

@FunctionalInterface
interface Practice2 {
    public void sayHello();
}


@FunctionalInterface
interface Practice1 extends Practice2{
    public void sayHello();
}
