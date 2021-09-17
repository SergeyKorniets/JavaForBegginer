package Homeworks.Lesson7;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public void showId() {
        System.out.println("Id of this worker is: " + id);
    }

    public void showSur() {
        System.out.println("Surname of this worker is: " + surname);
    }

    public void showSal() {
        System.out.println("Salary of this worker is: " + salary);
    }

    public Employee(int id1) {
        id = id1;
    }

    private Employee(double salary1) {
        salary = salary1;
    }

    Employee(String s) {
        surname = s;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Korniets");
        emp.showSal();
        emp.showId();
        emp.showSur();
    }
}
