package src.EqualMethod;

public class EqualNotUsingStringClass {
    public static void main(String[] args) {
        Pen pen1 = new Pen("Blue",10 );
        Pen pen2 = new Pen("Blue",10 );

        String a = new String("Jatin");
        String b = new String("Jatin"); //String Class .equal() method compare content of the String.



        if(a.equals(b)){
            System.out.println("true");  // So at the time of String object We do not to define equals method
        }
        else{
            System.out.println("false");
        }

        if(pen1.equals(pen2)){
            System.out.println("true");  // So at the time of object need to override equals method.
        }
        else{
            System.out.println("false");
        }

        System.out.println(pen1);
        System.out.println(pen2);
    }


}

class Pen{
    String color;
    int price;

    public Pen(String color, int price){
        this.color = color;
        this.price = price;
    }

   // Need To override and Define equals method to make to two different Object equal While its property are equal.

    @Override
    public boolean equals(Object obj){
        Pen pen = (Pen) obj;
        boolean isEqual = this.color.equals(pen.color) && this.price == pen.price;
        return isEqual;
    }
}