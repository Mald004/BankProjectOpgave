import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Customer Far = new Customer("Far",Status.REGULAR,1);
    Customer Søn = new Customer("Søn",Status.CHILD,2);

    BankAccount salaryAccount = new SalaryAccount(10,Far,10);
    BankAccount penguinAccount = new PenguinAccount(0,Søn);

    @Test
    void transferMoney() {
        Bank bank = new Bank();
        assertTrue(bank.transferMoney(salaryAccount,penguinAccount,10));
    }
}