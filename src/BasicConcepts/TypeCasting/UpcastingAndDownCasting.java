package src.BasicConcepts.TypeCasting;

class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    String color;

//    @Override
    public void eat2() {
        System.out.println("I love to eat cat");
    }
}

public class UpcastingAndDownCasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog b =  (Dog) a;
    }
}
