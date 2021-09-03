package Lesson3;

public class Test7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        boolean c = !(a > b);

        System.out.println(c);

        int d = 0;
        int e = 100;

        boolean f = a < b &&  d == e; // true && false = false
        System.out.println(f);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;

        System.out.println(b1^b2^b3^b4);
    }
}
