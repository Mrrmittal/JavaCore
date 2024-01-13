package src.ObjectClass.HashCode;

/*
    Collection framework concept HashSet, HashMap consists unique element. These collection do not use allow duplicate
    element. So for make the item unique hashCode() come into the existence.

 */

import java.util.*;

class Student{
    String name;
    int age;

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        Student student = (Student) obj;
        boolean isEqual = this.name.equals(student.name) && this.age == student.age;
        return isEqual;
    }

    public int hashCode(){
        return (name + age).hashCode();
    }
}

public class NeedToUseHashCode {

    public static void main(String[] args) {

        Student e2 = new Student("Sonu",25 );
        Student e7 = new Student("Sonu", 25);

        System.out.println(e2.hashCode());
        System.out.println(e7.hashCode());

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(e2);
        hashSet.add(e7);
        System.out.println(hashSet); // Output will be for 2 object because value same do not consider same object.

//        Need a hashCode() to make same value object provide uniqueness

    }

}

