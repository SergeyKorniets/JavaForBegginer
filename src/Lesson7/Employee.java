package Lesson7;

public class Employee {
   public double salary;

   public void upSalary(){
        System.out.println(salary * 2);
    }

   public Employee(double salary2) {
        salary = salary2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(2000);
        System.out.println(emp.salary);
        emp.upSalary();
    }
}
