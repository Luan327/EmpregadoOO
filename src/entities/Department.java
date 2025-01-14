package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;

    private Address address;

    List<Employee> emp = new ArrayList<Employee>();

    public Department(){}
    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw  new IllegalArgumentException("Name can't be null or empty");
        }
        this.name = name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public void setPayDay(Integer payDay) {
        if(payDay == null || payDay <=0 || payDay > 31){
            throw new IllegalArgumentException("Payday must be between 1 and 31");
        }
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void addEmployee(Employee employee){
        emp.add(employee);
    }
    public void removeEmployee(Employee employee){
        emp.remove(employee);
    }
    public Double payroll(){
        double sum = 0.0;
        for(Employee salary : emp){
            sum += salary.getSalary();
        }
        return sum;
    }
}
