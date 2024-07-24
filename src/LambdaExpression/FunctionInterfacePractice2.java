package src.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

class Student2{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int id;

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}



public class FunctionInterfacePractice2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1,"Jatin Mittal", 23);
        Student2 s2 = new Student2(2,"Nitin Mittal", 21);
        Student2 s3 = new Student2(3,"Kapil Mittal", 25);

        List<Student2> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        // write a function to return name of the student whose age is largest
        Function<List<Student2>, String> function = (studentsList) -> {

            Student2 maxAgeStudent = Collections.min(studentsList, (a, b) -> Integer.compare(a.getAge(), b.getAge()));

            return maxAgeStudent.getName();
        };

        // call function
        System.out.println(function.apply(students));
    }
}
