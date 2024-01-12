package src.WrapperClasses;

class Definition{
    /*

    1. Wrapper Classes are basically help to Wrap the Primitive data type Value. Or we can say Wrapper class are those
       who contains and wraps the primitive type values.
    2. As we Know that Primitive data are not the objects in java,but we need Objects for collection Frameworks and Data
       Structure And Synchronization in Multithreading in java. So we need to Wrapper class to wrap the primitive type
       Value.
    3. Primitive Data types (int, bool, char, byte, short, double, long, float) and there Wrapper class is (Integers,
       Boolean, Character, Byte, Short, Double, Long, Float)

     */
}
public class WrapperClassesDemo {
    public static void main(String[] args) {
        int num =   22;
        Integer num2 = new Integer(num);

        System.out.println(num2);
        System.out.println(num2.equals(num));
    }

}
