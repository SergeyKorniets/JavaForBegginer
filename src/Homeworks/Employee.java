package Homeworks;

public class Employee {
    Employee(int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
    void upSalary() {
        salary *= 2;
        System.out.println(salary);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee human1 = new Employee(1, "Roully", 28, 36700, "Photoshop");
        Employee human2 = new Employee(2, "Neverlove", 25, 74000, "Musical");
        human1.upSalary();
        human2.upSalary();
    }
}
