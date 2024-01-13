package src.EqualMethod;

class EqualMethodDefinition{
    /*
    1.) equals() method are basically the default method of Object class in java. we Usually see String Class override
        the equals() method. In String class equals() methods help to compare two different String object and return
        true if their content are meaningfully equivalent.

    2.) So, basically equals method works while the content of two different objects are meaningfully equal. Let suppose
        we have two Integers Object with same int value 5. So, equals methods tells true because there content are same

         */
}

public class EqualOverride {
    public static void main(String[] args) {
        String name1 = new String("Jatin Mittal");
        String name2 = new String("Jatin Mittal");

        Integer a = 25;
        Integer b = 25;

//        If we want to compare above object are equal we use equal() method.

        System.out.println(name1.equals(name2));
        System.out.println(a.equals(b));

    }
}
