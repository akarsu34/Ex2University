package Managment;

public class Employee {
    public String name;
    public int experience; // deneyim
    public Office office;
    public String branch;

    public Employee(String name, Office office, int experience, String branch) {
        this.name = name;
        this.office = office;
        this.experience = experience;
        this.branch = branch;

    }
}
