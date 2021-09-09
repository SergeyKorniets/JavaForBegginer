package Homeworks;

public class Student {
    int id;
    String name;
    String surname;
    int yearOfStudy;
    double math;
    double econ;
    double intern;

}

class StudentTest{
    public static void main(String[] args) {
        Student sergey = new Student();
        Student sofia = new Student();
        Student roma = new Student();

        sergey.id = 1;
        sergey.name = "Sergey";
        sergey.surname = "Korniets";
        sergey.yearOfStudy = 3;
        sergey.math = 4.6;
        sergey.econ = 3.8;
        sergey.intern = 5;

        sofia.id = 2;
        sofia.name = "Sofya";
        sofia.surname = "Lapteva";
        sofia.yearOfStudy = 3;
        sofia.math = 3.8;
        sofia.econ = 3.9;
        sofia.intern = 4.2;

        roma.id = 3;
        roma.name = "Roman";
        roma.surname = "Maslov";
        roma.yearOfStudy = 1;
        roma.math = 3.5;
        roma.econ = 4.1;
        roma.intern = 3.9;

        System.out.println("Студент: " + sofia.name + " " + sofia.surname);
        System.out.println("На данный момент год обучения: " + sofia.yearOfStudy);
        System.out.println("Средний балл по математике: " + sofia.math);
        System.out.println("Средний балл по экономике: " + sofia.econ);
        System.out.println("Средний балл по иностранному языку: " + sofia.intern);
        System.out.println(" ");

        System.out.println("Студент: " + sergey.name + " " + sergey.surname);
        System.out.println("На данный момент год обучения: " + sergey.yearOfStudy);
        System.out.println("Средний балл по математике: " + sergey.math);
        System.out.println("Средний балл по экономике: " + sergey.econ);
        System.out.println("Средний балл по иностранному языку: " + sergey.intern);
        System.out.println(" ");

        System.out.println("Студент: " + roma.name + " " + roma.surname);
        System.out.println("На данный момент год обучения: " + roma.yearOfStudy);
        System.out.println("Средний балл по математике: " + roma.math);
        System.out.println("Средний балл по экономике: " + roma.econ);
        System.out.println("Средний балл по иностранному языку: " + roma.intern);
        System.out.println(" ");
    }
}
