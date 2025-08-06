package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {

        Employee e1 = new Employee.Builder()
                .setName("John")
                .setSalary(50000)
                .setDepartment("Frontend")
                .build();

        System.out.println(e1.hashCode());
        System.out.println(e1.toString());

        Employee e2 = new Employee.Builder()
                .setName("John")
                .setSalary(60000)
                .setDepartment("Backend")
                .build();
        System.out.println(e2.hashCode());
        System.out.println(e2.toString());

        Employee e3 = new Employee.Builder()
                .setSalary(30000)
                .setDepartment("QA Tester")
                .build();
        System.out.println(e3.toString());
    }


}
