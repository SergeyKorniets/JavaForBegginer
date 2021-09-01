package Homeworks;

public class Homework2 {
    public static void main(String [] args) {
        byte a1 = 12;           // 10-ричная
        byte a2 = 0b1100;       // 2-ичная
        byte a3 = 014;          // 8-ричная
        byte a4 = 0xC;          // 16-ричная
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        short s1 = 1300;
        short s2 = 0b0101_0001_0100;
        short s3 = 02424;
        short s4 = 0x514;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0b0;
        int i3 = 00;
        int i4 = 0x0;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789L;
        long l2 = 0b111_0101_1011_1100_1101_0001_0101;
        long l3 = 0726_746_425;
        long l4 = 0x75B_CD15;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        float f1 = -1.79f;
        float f2 = 12.34f;
        double d1 = 3.14;
        double d2 = -6.28;
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);

        char c1 = 'a';
        char c2 = '\u0430';
        char c3 = 97;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
