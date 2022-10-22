package Managment;

public class CivilServant extends Employee{ // devlet memuru
    public String name;
    public Office office;
    public String branch;
    public int experience; // deneyim

    public CivilServant(String name, Office office, int experience, University university,String branch) {
        super(name, office, experience,branch);
        this.name = name;
        this.office = office;
        this.experience = experience;
        this.branch = branch;
        office.addEmployeeList(this);
        university.addEmployeeList(this);
    }
}
