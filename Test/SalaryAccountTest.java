import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAccountTest {

    Customer customer2 = new Customer("Hans",Status.REGULAR,2);
    BankAccount bankAccount = new BankAccount(100,customer2) {
        @Override
        void setOwner(Customer owner) {}

        @Override
        boolean withdraw(double amount){
            return false;
        }

        @Override
        int getId() {
            return 0;
        }

        @Override
        public void deposit(double amount) {

        }

        @Override
        public double getBalance() {
            return 0;
        }

        @Override
        public Customer getOwner() {
            return null;
        }
    };

    @Test
    void testSetCreditlimit() {



    }




}