package src.OptinalClass;

import java.util.Optional;

public class OptionalClassPractice {

    public String name(int id){
        return "Name";
    }

    public Optional<String> name2(int id){
        Optional<String> name = Optional.ofNullable(null);
        return name;
    }



    public static void main(String[] args) {
        OptionalClassPractice obj = new OptionalClassPractice();

        System.out.println(obj.name(1).toUpperCase());
        System.out.println(obj.name2(2).orElse("Nhi bhai null hai"));
    }
}
