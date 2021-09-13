package Lesson5;

public class Human {
    String name;
    Car car;
    BankAccount bA;

    void info() {
        System.out.println("Name: " + name + ", color: " + car.color + ", balance: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Sergey";
        h.car = new Car("Red", "V8");
        h.bA = new BankAccount(3, 940);
        h.info();
    }
}

class Car {
    Car(String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}
