package AbstractFactoryDesignPattern;

public class FrontendDev implements Employee {

    @Override
    public int getSalary() {
        return 50000;
    }

    @Override
    public String getName() {
        return "Hi I am Frontent Dev";
    }
}
