package src.ToStringPractice;

class Definition{
/* toString() method is basically used to "Text Representation" of the Object in java.
   Every class in java subclass of an Object Class and the toString() method is the call by itself while we print an object.
   and provide the readable text representation of the Object.
     */
}


public class ToStringDemo {
    //    Property of a student
    String name;
    int age;

    ToStringDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ToStringDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ToStringDemo s1 = new ToStringDemo("Jatin", 22);
        System.out.println(s1);
    }
/*  In case of toString method isn't define
    Output be will : src.ToStringPractice.ToStringDemo@6acbcfc0 (Because s1.toString will call while we print Object )
   but we did not define toString then Package_name.class_name@HashCode will print.

   In case of toString method  define
   OutPut will be ToStringDemo{name = 'Jatin', age=22}
*/
}
