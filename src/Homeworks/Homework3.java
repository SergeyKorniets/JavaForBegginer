package Homeworks;

public class Homework3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2/d1 + d2 % i1 - l;
        System.out.println(result);

        int a = 5, result2 = 0;
        result2 = a-- - --a + ++a + a++ + a;
        System.out.println(result2);

        int b = 8, result3 = 0;
        result3 = ++b - b++ + ++b - --b;
        System.out.println(result3);
    }
}
