package Homeworks;

public class Student {
    int id;
    String name;
    String surname;
    int yearOfStudy;
    double math;
    double econ;
    double intern;

    Student(int id1, String name1, String surname1, int yearOfStudy1, double math1, double econ1, double intern1){
        id = id1;
        name = name1;
        surname = surname1;
        yearOfStudy = yearOfStudy1;
        math = math1;
        econ = econ1;
        intern = intern1;
    }

    Student(int id1, String name1, String surname1, int yearOfStudy1) {
        this(id1, name1, surname1, yearOfStudy1, 0.0, 0.0, 0.0);
    }

    Student(){
        this(0, null, null, 0, 0.0, 0.0, 0.0);
    };


}

class StudentTest{
    void avg(Student st) {
        double avr = (st.math + st.econ + st.intern) / 3;
        System.out.println(avr);
    }

    public static void main(String[] args) {
        Student sergey = new Student(1, "Sergey", "Korniets", 3, 4.6, 3.6, 5);
        Student ivan = new Student(2, "Ivan", "Ivanov", 2);
        Student anton = new Student();


        StudentTest message = new StudentTest();

        System.out.println(sergey.name);
        System.out.println(ivan.surname);
        System.out.println(anton.yearOfStudy);
    }
}
