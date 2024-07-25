package src.LambdaExpression;

@FunctionalInterface
interface Car{
    void move();

    default int haveTyres(int tyre){
        return tyre;
    }

    static String haveBrand(String name){
        return name;
    }

}

public class Practice4 {
    public static void main(String[] args) {
        // by using lambda expression
        Car car = () -> System.out.println("Yes Can Easily move"); //implementation of interface

        car.move();
        System.out.println(car.haveTyres(4));
        System.out.println(Car.haveBrand("ABC"));

        System.out.println("---------------------");
        //by using Anonymous class


        Car car1 = new Car() {
            @Override
            public void move() {
                System.out.println("Yes");
            }

            @Override
            public int haveTyres(int tyre){
                return tyre;
            }

        };

        car1.move();
        System.out.println(car1.haveTyres(4));
        System.out.println(Car.haveBrand("PQR"));

    }
}
