package src.BasicConcepts.TypeCasting;

class Animal{
    String name;

    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    String color;

    public void eat1() {
        System.out.println("I love to eat cat");
    }
}

public class UpcastingAndDownCasting {
    public static void
    main(String[] args) {
        Animal a = new Dog();
        a.eat();

        Dog d = (Dog)a;
        d.eat1();
    }
}
