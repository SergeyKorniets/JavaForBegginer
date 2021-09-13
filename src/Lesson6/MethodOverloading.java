package Lesson6;

public class MethodOverloading {
    void show (int i1) {
        System.out.println(i1);
    }

    void show (boolean b1) {
        System.out.println(b1);
    }

    void show (String s1) {
        System.out.println(s1);
    }

    void show (String s, int a) {
        System.out.println("String is: " + s + ", Int is: " + a);
    }

    void show (int a, String s) {
        System.out.println("Какой хороший день!");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        int a = 500;
        mo.show(a);

        boolean b = true;
        mo.show(b);

        String s = "Hi";
        mo.show(s);

        mo.show("String", 10);
    }
}
