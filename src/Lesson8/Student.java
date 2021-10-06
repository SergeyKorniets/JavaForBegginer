package Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student(String name1, int course1) {
        count++;
        name = name1;
        course = course1;
        System.out.println("Student's number is: " + count + "!");
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Peter", 4);
        Student st3 = new Student("Masha", 2);
    }
}
