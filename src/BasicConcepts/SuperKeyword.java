package src.BasicConcepts;
/*
In Java, the super keyword is a reference variable used to refer to the immediate parent class object. Means super
keyword in java used by the subClass to refer the base or Parent class.

## but mainly super keyword used only when subClass and the parentClass have both the same named objects.
## super keyword can be used for variable, methods as well as constructor.
 */

// Example of super keyword

class Base{
    int a = 10;
    public void show(){
        System.out.println(a);
    }


}

class Derived extends Base{
    int a = 20;
    @Override
    public void show(){
        System.out.println(a); // prioritized to his variable
        System.out.println(super.a); // refer to base class variable
        super.show(); //refer base class method
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.show();
    }
}
