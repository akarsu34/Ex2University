package Managment;

public class Professor  extends Employee{
    public String name;
    public String branch;
    public University university;
    public Office office;
    public int experience; // deneyim

    public Professor(String name, String branch, Office office, int experience, University university) {
        super(name, office, experience,branch);
        this.name = name;
        this.branch=branch;
        this.office=office;
        this.experience = experience;
        this.university = university;
        office.addEmployeeList(this);
        university.addEmployeeList(this);

    }
}
