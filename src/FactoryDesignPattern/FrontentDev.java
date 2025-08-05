package FactoryDesignPattern;

public class FrontentDev implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Hi I am Frontent Dev");
        return 50000;
    }
}
