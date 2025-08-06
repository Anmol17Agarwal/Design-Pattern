package BuilderDesignPattern;

public class Employee {
    private final String name;
    private final int salary;
    private final String department;

    private Employee(Builder builder){
        this.name = builder.name;
        this.salary = builder.salary;
        this.department = builder.department;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private int salary;
        private String department;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setSalary(int salary){
            this.salary = salary;
            return this;
        }
        public Builder setDepartment(String department){
            this.department = department;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }


    }
}
