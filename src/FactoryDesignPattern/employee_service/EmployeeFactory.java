package FactoryDesignPattern.employee_service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EmployeeFactory {

    private static final Map<EmployeeType, Supplier<Employee>> map = new HashMap<>();

    static{
        map.put(EmployeeType.FRONTEND_DEV, FrontendDev::new);
        map.put(EmployeeType.BACKEND_DEV, BackendDev::new);
    }

    public static Employee getEmployee(EmployeeType type) {
        Supplier<Employee> supplier = map.get(type);
        if (supplier != null) {
            return supplier.get();
        }
        throw new EmployeeNotFoundException("Invalid employee type: " + type);
    }
}
