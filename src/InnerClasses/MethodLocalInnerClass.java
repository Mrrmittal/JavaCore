package src.InnerClasses;

/*
Que: Define MethodLocalInnerClasses in Java?
Sol: A inner class that scoped also defined inside the method of an Outer class. In simple words we can also define an
     inner class within a method:
 */

public class MethodLocalInnerClass {

    public void sum(int x , int y){
        class sum{
           public void doSum(){
               System.out.println(x + y);
           }
        }
           sum obj = new sum();
           obj.doSum();
    }

    public static void main(String[] args) {
        MethodLocalInnerClass obj = new MethodLocalInnerClass();
        obj.sum(8,10);
    }
}
