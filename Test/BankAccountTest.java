import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    //@BeforeEach
    //      void beforeeach(){
    //bankAccount.balance = 0; //should be salary account, and not bankaacount
    //}

    Customer Mikkel = new Customer("Mikkel",Status.REGULAR,1);
    BankAccount bankAccount;

    //BankAccount account = new SalaryAccount(100,Mikkel);

    @BeforeEach
    void setUp() {
        this.bankAccount = new BankAccount(0, Mikkel) {
            @Override
            void setOwner(Customer owner){}
            @Override
            boolean withdraw(double amount)  {
                if (amount > this.balance){
                    return false;                }
                else this.balance = balance - amount;
                return true;
            }
            @Override
            int getId(){return 0;}
            @Override
            public void deposit(double amount){
                balance = balance + amount;
            }
            @Override
            public double getBalance(){return 0;}
            @Override
            public Customer getOwner(){return null;}
        };
    }

    @Test
    void deposit() {
        this.bankAccount.deposit(20);
        assertEquals(20,this.bankAccount.balance);
    }

    @Test
    void withdraw() throws Exception {

        this.bankAccount.deposit(100);
        assertEquals(100,this.bankAccount.balance);

        try {
            this.bankAccount.withdraw(100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(0,this.bankAccount.balance);

        // another way to do
        BankAccount ba = new SalaryAccount(100,Mikkel,100);
        ba.withdraw(100);
        double d = ba.getBalance();
        assertEquals(-100,d);


    }

    @Test
    void setOwner() {

        this.bankAccount.setOwner(Mikkel); //does not do anything


    }
}


/*




 */