package Managment;

import java.util.ArrayList;
import java.util.List;

public class Department {
    public String name;
    public static List<Office> officeList;

    static {
        officeList = new ArrayList<>();
    }

    public Department(String name) {
        this.name = name;
    }

    public void listAdd(Office office){
        officeList.add(office);
    }
}
