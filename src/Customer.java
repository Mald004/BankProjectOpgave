import java.math.BigInteger;
import java.util.ArrayList;

public class Customer {
    public ArrayList<BankAccount> accounts;
    private Status status;

    public Customer(){
        accounts = new ArrayList<>();
    }

    public int getId() {
        return 0;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
