class Employee{
    String name;
    int salary;

    void setname(String s){
        name=s;
    }
    void setsalary(int newsalary){
        salary=newsalary;
    }
    int getsalary(){
        return salary;
    }
}


public class ClassAndObject{
    public static void main(String[]args){
        Employee obj1= new Employee();
        obj1.setname("gaurav");
        obj1.setsalary(10000);

        Employee obj2 = new Employee();
        obj2.setname("nikita");
        obj2.setsalary(20000);

        System.out.println("salary is " + obj1.getsalary());
        System.out.println("salary is " + obj2.getsalary());
    }
}
