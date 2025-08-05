package AbstractFactoryDesignPattern;

public class AbstractFactoryClient {

    public static void main(String[] args) {
       Employee e1 = EmployeeFactory.getEmployee(new FrontendDevFactory());
        System.out.println(e1.getName()+" and salary "+e1.getSalary());
        Employee e2 = EmployeeFactory.getEmployee(new BackendDevFactory());
        System.out.println(e2.getName()+" and salary "+e2.getSalary());
    }
}
