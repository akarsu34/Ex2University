package Managment;

import java.util.ArrayList;
import java.util.List;

public class Office {  // Ofis
    public String name;
    public Department department;
    public static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();

    }

    public Office(String name, Department department) {
        this.name = name;
        this.department = department;
        department.listAdd(this);
    }

    public void addEmployeeList(Employee employee){
        employeeList.add(employee);
    }
}
