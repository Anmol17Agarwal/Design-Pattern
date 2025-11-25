package FactoryDesignPattern.employee_service;

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
        Employee emp1 = EmployeeFactory.getEmployee(EmployeeType.FRONTEND_DEV);
        System.out.println(emp1.getSalary());

        Employee emp2 = EmployeeFactory.getEmployee(EmployeeType.BACKEND_DEV);
        System.out.println(emp2.getSalary());

        Employee emp3 = EmployeeFactory.getEmployee(EmployeeType.valueOf("JAVA_DEV"));
        System.out.println(emp3.getSalary());
    }

}
