package src.WrapperClasses;

class UnboxingDefinition {
  /*
    Automatic conversion of Object value into the Object primitive data type value of their Corresponding Wrapper Class.
    Reverse to Autoboxing
   */
}


public class Unboxing {
    public static void main(String[] args) {
        Integer num = new Integer(25);

        int num2 = num.intValue(); //Convert an Object value of num into the Primitive Data Type
        int num3 = num; // Easily Assign Object into in the Primitive Data type
        System.out.println(num3);


    }
}
