package entities;

public class Employee {
    private String name;
    private Double salary;

    public Employee(){}

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary == null || salary <= 0){
            throw new IllegalArgumentException(("Salary Can't be Null or less than zero"));
        }
        this.salary = salary;
    }
}
