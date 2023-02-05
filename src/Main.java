import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer Far = new Customer("Far",Status.REGULAR,1);
        Customer Søn = new Customer("Søn",Status.CHILD,2);

        BankAccount salaryAccount = new SalaryAccount(100,Far,1);
        BankAccount penguinAccount = new PenguinAccount(0,Søn);

        Bank bank = new Bank();
        bank.transferMoney(salaryAccount,penguinAccount,15);
        System.out.println(penguinAccount.balance);
    }
}