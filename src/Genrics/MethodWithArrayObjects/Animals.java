package src.Genrics.MethodWithArrayObjects;

abstract class Animals {
    abstract void checkUp();
}

class Dog extends Animals{
    @Override
    public void checkUp(){
        System.out.println("Dogs need checkup");
    }
}

class Cat extends Animals{
    @Override
    public void checkUp(){
        System.out.println("Cats need checkup");
    }
}

class Horse extends Animals{
    @Override
    public void checkUp(){
        System.out.println("Horse need checkup");
    }
}

