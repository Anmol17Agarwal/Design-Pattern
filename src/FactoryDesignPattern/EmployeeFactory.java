package FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String type) {
        if (type.trim().equalsIgnoreCase("Frontend Dev")) {
            return new FrontentDev();
        } else if (type.trim().equalsIgnoreCase("Backend Dev")) {
            return new BackendDev();
        } else {
            return null;
        }
    }
}
