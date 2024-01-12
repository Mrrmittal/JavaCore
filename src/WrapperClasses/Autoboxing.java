package src.WrapperClasses;

class AutoboxingDefinition{
  /*
    Automatic conversion of primitive data type value into the Object of their Corresponding Wrapper Class.
   */
}

public class Autoboxing {
    public static void main(String[] args) {

        int num = 22;
//        Integer num2 = Integer.valueOf(num); // Convert the Primitive type of num into the Object

        Integer ab = num; // Easily Assign Primitive data type value to make an Object With the help of Autoboxing.
        Integer bc = num; // Easily Assign Primitive data type value to make an Object With the help of Autoboxing.

//        System.out.println(num2);
        System.out.println(ab);
        System.out.println(bc);
    }


}
