package Homeworks;

public class Sum {

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a) {
        return a;
    }

    int sum() {
        return 0;
    }

}

class SumTest {
    public static void main(String[] args) {
        Sum sum1 = new Sum();
        System.out.println(sum1.sum());
        System.out.println(sum1.sum(1));
        System.out.println(sum1.sum(1, 2));
        System.out.println(sum1.sum(1, 2, 3));
        System.out.println(sum1.sum(1, 2, 3, 4));
    }
}
