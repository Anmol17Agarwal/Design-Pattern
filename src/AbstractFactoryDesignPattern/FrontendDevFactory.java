package AbstractFactoryDesignPattern;

public class FrontendDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new FrontendDev();
    }
}
