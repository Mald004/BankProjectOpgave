import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumAccountTest {

    @Test
    void setOwner() {
        Customer customer1 = new Customer();
        Status status = Status.ADULT;
        customer1.setStatus(status);
        BankAccount acc = new PenguinAccount(3000,null);
        acc.setOwner(customer1);
        assertEquals(customer1,acc.getOwner());//Has the owner been set
        assertEquals(acc,customer1.accounts.get(0)); //Has account been added to list
    }

    @Test
    void withdraw() {
        PenguinAccount acc = new PenguinAccount(0,null);
        assertEquals(false,acc.withdraw(2000));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(2001));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(200));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(0));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(-200));
        acc.balance = 200;
        assertEquals(true,acc.withdraw(200));

    }
}