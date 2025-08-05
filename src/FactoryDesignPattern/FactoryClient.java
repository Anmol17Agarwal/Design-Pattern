package FactoryDesignPattern;

public class FactoryClient {
    /*
     * When there is superclass and multiple subclasses
     * and we want to get object of sub classes based on input and requirements
     *
     * Then we use Factory Design Pattern which takes the responsibility of creating objects of class based on input
     *
     * Advantages:
     * 1. Focus on creating objects for interface not implementation
     * 2. Loose coupling and robust code
     * */

    public static void main(String[] args) throws Exception {
        try {
            Employee employee = EmployeeFactory.getEmployee("Frontend Dev");
            System.out.println("Salary: " + employee.getSalary());
            Employee employee1 = EmployeeFactory.getEmployee("Backend Dev");
            System.out.println("Salary: " + employee.getSalary());
            Employee employee2 = EmployeeFactory.getEmployee("Java Dev");
            employee2.getSalary();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
