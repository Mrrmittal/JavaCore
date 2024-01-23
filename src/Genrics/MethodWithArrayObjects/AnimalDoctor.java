package src.Genrics.MethodWithArrayObjects;

public class AnimalDoctor {
    public void CheckAnimals(Animals[] animals) {
        for (Animals a : animals) {
            a.checkUp();
        }
    }


    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        Horse[] horses = {new Horse()};

        AnimalDoctor animalDoctor = new AnimalDoctor();
        animalDoctor.CheckAnimals(dogs);
        animalDoctor.CheckAnimals(cats);
        animalDoctor.CheckAnimals(horses);
    }
}
