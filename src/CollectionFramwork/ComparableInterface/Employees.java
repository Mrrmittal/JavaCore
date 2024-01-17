package src.CollectionFramwork.ComparableInterface;

public class Employees implements Comparable<Employees> {
    int empId;
    String name;
    String department;

    public Employees(int empId, String name, String department){
        this.empId = empId;
        this.name = name;
        this.department = department;
    }
//    @Override
//    public int compareTo(Employees obj) {
//        return this.name.compareTo(obj.name);  String type property implementation
//    }

    @Override
    public int compareTo(Employees obj) {
        return this.name.compareTo(obj.name); // int typed property implementation
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';


        }

        public String getName(){
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getEmpId() {
        return empId;
    }
}
