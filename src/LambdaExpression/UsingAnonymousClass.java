package src.LambdaExpression;


interface Employee{
    String haveName(String name);
    int haveSalary(int Salary);
}

//implementation of Employee interface using Anonymous class
public class UsingAnonymousClass {
    public static void main(String[] args) {

        Employee employee = new Employee() {
            @Override
            public String haveName(String name) {
                return name;
            }

            @Override
            public int haveSalary(int salary) {
                return salary;
            }
        };

        System.out.println(employee.haveName("Jatin Mittal") + " : " + employee.haveSalary(2000000));
    }
}
