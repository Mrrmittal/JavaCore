package src.ObjectClass.EqualMethod;

class EqualsMethodVsEqualsOperatorDifference{
    /*
    EqualsOperators(==) : If we want to compare the reference to the same object or check the memory location of the
    Object in the heap area. We use the == Operators. (Or to check the primitive type)

    While equals methods help two to compare two object are logically or meaningful equal pr not
     */
}

class Student1 {
    String name;
    int rollNo;
    int age;
    String course;

    Student1(String name, int rollNo, int age, String course ){
            this.name = name;
            this.rollNo = rollNo;
            this.age = age;
            this.course = course;
    }
}
class Student2 {
    String name;
    int rollNo;
    int age;
    String course;

    Student2(String name, int rollNo, int age, String course ){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
    }
}
public class EqualsMethodVsEqualsOperator {
    public static void main(String[] args) {
    Student1 s1 = new Student1("Jatin Mittal", 5, 22, "MCA");
    Student2 s2 = new Student2("Mohit Yadav", 17, 23, "MCA");

    Integer a = new Integer(5);
    Integer b = new Integer(5);
    // We need to compare this two object are same or not according to there Course detail.

        System.out.println(s1.course.equals(s2.course));


        if (a == b){
            System.out.println("True");
        }
        else {
            System.out.println("false"); // False because two different Object.
        }
    }

}
