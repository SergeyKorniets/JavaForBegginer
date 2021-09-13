package Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gas(int a){
        speed += a;
        return speed;
    }

    int brake(int a){
        speed -= a;
        return speed;
    }

    void showInfo() {
        System.out.println("Color is: " + color + " , engine: " + engine + " , speed: " + speed);
    }
}

class Car2_Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "White";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gas(20);
        c1.showInfo();
        c1.brake(c1.speed);
        c1.showInfo();
    }
}
