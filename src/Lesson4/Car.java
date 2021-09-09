package Lesson4;

public class Car {
    String color = "Red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "pink";
        car1.engine = "V8";

        System.out.println("Color is " + car1.color);
        System.out.println("Motor is " + car1.engine);
    }
}
