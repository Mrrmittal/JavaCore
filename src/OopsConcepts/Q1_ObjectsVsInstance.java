package src.OopsConcepts;

/* Definition
   Object: Object is the instance of a Class, Class is a blueprint or template that define the Properties and the
           Behaviour of the Object. We can say that if we create an object we create an instance of the class.

   Instance: Instance is a specific Occurrence of a class. With the new keyword we can Create the Instance of a class
             in the term of object.

 */


public class Q1_ObjectsVsInstance {
    public void define(){
        System.out.println("This is a method..");
    }
    public static void main(String[] args) {

//        Create an Instance of the class.
        Q1_ObjectsVsInstance myObj = new Q1_ObjectsVsInstance();

//       Call define method with using of Object.
        myObj.define();
    }


}
