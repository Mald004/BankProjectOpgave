import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAccountTest {

    @Test
    void setOwner() {
        Customer customer1 = new Customer("Malde", Status.ADULT,1);
        Status status = Status.ADULT;
        customer1.setStatus(status);
        BankAccount acc = new SalaryAccount(3000,null);
        acc.setOwner(customer1);
        assertEquals(customer1,acc.getOwner());//Has the owner been set
        assertEquals(acc,customer1.accounts.get(0)); //Has account been added to list
    }

    @BeforeEach
    void beforeeach(){
        SalaryAccount acc = new SalaryAccount(0,null);
        acc.balance = 0;
    }


    @Test
    void withdraw() {
        SalaryAccount acc = new SalaryAccount(0,null);
        acc.setCreditLimit(2000);
        assertEquals(true,acc.withdraw(2000));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(2001));
        acc.balance = 0;
        assertEquals(true,acc.withdraw(200));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(0));
        acc.balance = 0;
        assertEquals(false,acc.withdraw(-200));

    }



    @Test
    void getCreditLimit() {

    }

    @Test
    void setCreditLimit() {
        SalaryAccount acc = new SalaryAccount(0,null);
        acc.setCreditLimit(2000);
        assertEquals(2000,acc.getCreditLimit());
    }
}