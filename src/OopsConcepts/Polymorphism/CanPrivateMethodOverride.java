package src.OopsConcepts.Polymorphism;

class Base{

    private void fun(){
        System.out.println("base class fun");

    }

    public static void main(String[] args) {
        Base obj = new Base();
        obj.fun();
    }
    class InnerClass{

    }
}

class Derived extends Base{
//    @Override (We can not override private method because private have accessibility with in the same class)
    private void fun(){
        System.out.println("Derived class fun");
    }

}

public class CanPrivateMethodOverride {
    public static void main(String[] args) {
        Base obj = new Base();
//        obj.fun();
    }
}
