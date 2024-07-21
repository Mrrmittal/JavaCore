package src.InnerClasses;

public class LocalInnerClass {
    private String x = "Outer Variable";

    public void doPrint(){
        String z = "Local Variable";
        class MyInner{
            public void print(){
                System.out.println("X is : "+x);
                System.out.println("Z is : "+z);
                x = "";
//                z = ""; can't access local variable of print method here.
            }
        }
        MyInner obj = new  MyInner();
        obj.print();

    }
    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.doPrint();
    }
}
