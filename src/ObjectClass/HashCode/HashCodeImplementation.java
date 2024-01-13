package src.ObjectClass.HashCode;

public class HashCodeImplementation{
    public static void main(String[] args) {

    Employee e1 = new Employee("Manoj", "CTO");
    Employee e2 = new Employee("Manoj", "CTO");

    /*
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        If we do not define the hashcode method below hashcode output will be the different for the upr both similar
        value Object. Because we can say every property with different diff hashCode.

        System.out.println(e1.name.hashCode());
        System.out.println(e2.name.hashCode());

        If we check hashcode upper specific field it will be the same.
     */

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}


class Employee{
    String name;
    String designation;

    public Employee(String name,String designation){
        this.name = name;
        this.designation = designation;
    }

    @Override
    public int hashCode(){
        return (name + designation).hashCode();
    }

}


