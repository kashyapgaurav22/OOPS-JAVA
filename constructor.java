class Employee{
    String name;
    int salary;

    Employee(){
        salary=10000;
    }
    int getsalary(){
        return salary;
    }
}

public class constructor {
    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.getsalary());
    }
}