package Managment;

public class Main {

    public static void main(String[] args) {
        University university1 = new University("Hacettepe Uni","Ankara","Mahmut Tuncer");
        Department department1 = new Department("Bilgisayar Bilimleri");
        Office office1 = new Office("İnsan Kaynaklari",department1);
        Professor professor1 = new Professor("ismail yk","Muzigin Kodlama Ile Seruveni",office1,2,university1);
        CivilServant civilServant1 = new CivilServant("Ahmet Bikkin",office1,1,university1,"memur");


        university1.printInfo();

    }

}
