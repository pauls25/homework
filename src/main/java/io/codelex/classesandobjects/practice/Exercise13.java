package io.codelex.classesandobjects.practice;

public class Exercise13 {
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        System.out.println("------------------");

        Account account = new Account("account", 100.0);
        account.deposit(20.0);

        Account matsAccount = new Account("Mat", 1000.0);
        Account myAccount = new Account("Me", 0.0);

        matsAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(matsAccount.toString());
        System.out.println(myAccount.toString());

        System.out.println("----------------");

        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);

        transfer(a, b, 50);
        transfer(b, c, 25);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
