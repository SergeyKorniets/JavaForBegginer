package Homeworks.Lesson8;

public class Homework8 {
    static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    static void division(double a, double b) {
        double result1 = a / b;
        double result2 = a % b;
        System.out.println("Результат деления первого числа на второе: " + result1);
        System.out.println("Остаток: " + result2);
    }

    static final double p = 3.14;

    void radius(double r) {
        double s = p * r * r;
        System.out.println("Площадь равна: " + p * r * r);
    }

    static void non(double r) {
        double h = 2 * p * r;
        System.out.println("Длина равна: " + 2 * p * r);
    }

    void info(double r) {
        System.out.println("Радиус равен: " + r);
        System.out.println("Площадь равна: " + p * r * r);
        System.out.println("Длина равна: " + 2 * p * r);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Homework8.multiply(10, 15, 20));

        Homework8.division(10, 2);

        System.out.println(Homework8.multiply(5, 8, 13));

        Homework8.division(13, 4);


        Homework8 o = new Homework8();
        o.radius(2);
        Homework8.non(2);
        o.info(5);

    }
}
