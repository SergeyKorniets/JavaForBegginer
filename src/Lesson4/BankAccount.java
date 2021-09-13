package Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    double upBalance(double a) {
        balance += a;
        return balance;
    }

    double downBalance(double a) {
        balance -= a;
        return balance;
    }

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Sergey";
        myAccount.balance = 750.31;

        yourAccount.id = 2;
        yourAccount.name = "Ivar";
        yourAccount.balance = 456.29;

        hisAccount.id = 3;
        hisAccount.name = "Bjorn";
        hisAccount.balance = 14324.1;

        System.out.println(myAccount.id);

        myAccount.downBalance(50.31);
        System.out.println(myAccount.balance);
    }
}
