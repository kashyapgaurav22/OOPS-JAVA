class employee{
    String name;
    int salary;

    employee(String newname , int newsalary){
        this.name= newname;
        this.salary=newsalary;
    }

    String getName() {
        return name;
    }

    int getsalary(){
        return salary;
    }
}


public class parameterizedcons {
    public static void main(String[]args){
        employee obj= new employee("gaurav",10000);
        System.out.println(obj.getName());
    }
}
