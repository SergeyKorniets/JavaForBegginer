package Lesson2;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        byte b1 = 10; // Byte
        byte b2 = 20; // Byte
        byte b3 = 127; // Max value
        byte b4 = -128; // Min value

        short s1 = 5; // Short
        short s2 = -10; // Short
        short s3 = 32767; // Max value
        short s4 = -32768; // Min value

        int i1 = 500; // int
        int i2 = -200;// int
        int i3 = 2147483647; // Max value
        int i4 = -2147483648;// Min value

        long l1 = 1000; // long
        long l2 = 100000000000L; // Data Type - Long
        long l3 = -10000000000L; // Data Type - Long

        float f1 = 3.14f; // Data Type - Float
        float f2 = 2.5f;  // Data Type - Float
        float f3 = 20;    // Int is inside Float
        float f4 = 20.0f; // Data Type - Float

        double d1 = 5.5; // Double
        double d2 = 87.65;// Double

        char c1 = '0'; // Char
        char c2 = 'A'; // Char (Only '')
        char c3 = 'b'; // Char

        char c5 = 200; // Special symbol

        char c6 = '\u1234'; // Special symbol

        boolean bool1 = true; // Bool - True
        boolean bool2 = false;// Bool - False

        int a1 = 60;
        System.out.println(a1); // Output 60

        int a2 = 0B111100; // Идущее число после "0B(0b)" - Двоичная система счисления
        System.out.println(a2); // Still output 60

        int a3 = 074;      // Идущее число после "0" - Восьмиричная система счисления
        System.out.println(a3); // And still output 60

        int a4 = 0x3C;     // Идущее число после "0x" - Шестнадцатиричная система счисления
        System.out.println(a4); // And still output 60

        int a7 = 1_000_000; // "_" используется для читабельности чисел с большим количеством цифр

    }
}
