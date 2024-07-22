package src.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    int studentId;
    String studentName;
    int studentAge;

    public Student(int studentId, String studentName, int studentAge){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return this.studentId + ": " +this.studentName;
    }
}


public class ComparatorInterfaceUsingLambdaExpressionWithCustomObjects {
    public static void main(String[] args) {
        Student student = new Student(13,"Jatin", 12);
        Student student2 = new Student(23,"Jatin", 12);
        Student student3 = new Student(43,"Jatin", 12);

        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        Collections.sort(list,(a,b) -> b.studentId - a.studentId);

        System.out.println(list);
    }
}
