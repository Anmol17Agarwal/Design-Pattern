package FactoryDesignPattern.employee_service;

public class FrontendDev implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Hi I am Frontend Dev");
        return 50000;
    }
}
