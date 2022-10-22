package Managment;


import java.util.ArrayList;
import java.util.List;

public class University {
    public String name;
    public String city;
    public String deanName; // dekan
    public static List<Employee> uniEmployeeList;

    static {
        uniEmployeeList = new ArrayList<>();
    }

    public University(String name, String city, String deanName) {
        this.name = name;
        this.city = city;
        this.deanName = deanName;
    }

    public void addEmployeeList(Employee employee) {
        uniEmployeeList.add(employee);

    }

    public void printInfo() {
        System.out.println("--------------");

        for (Employee e : uniEmployeeList) {
            System.out.println("-[Uni] : " + this.name+ " -[Name]: " +e.name + " -[Experience] :  " +e.experience+ " -[Branch Name] :" + e.branch
                    +"\n-[Department Name] : " + e.office.department.name + " -[Office Name] : " + e.office.name );
        }
        System.out.println("--------------");
    }
}
