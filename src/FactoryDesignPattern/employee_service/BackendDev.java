package FactoryDesignPattern.employee_service;

public class BackendDev implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Hi I am Backend Dev");
        return 60000;
    }
}
