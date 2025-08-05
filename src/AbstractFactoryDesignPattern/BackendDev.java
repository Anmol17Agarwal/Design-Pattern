package AbstractFactoryDesignPattern;

public class BackendDev implements Employee {
    @Override
    public int getSalary() {
        return 60000;
    }

    @Override
    public String getName() {
        return "Hi I am Backend Dev";
    }
}

