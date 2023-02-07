import java.util.HashMap;

public class SalaryAccount extends BankAccount{

    private double creditlimit;

    public SalaryAccount(double balance, Customer owner, double creditlimit) {
        super(balance, owner);
        this.creditlimit = creditlimit;
    }

    void setCreditlimit(double amount){
        if (owner.getStatus() == Status.REGULAR){
            creditlimit = amount;
        }

    }

    public double getCreditlimit() {
        return creditlimit;
    }

    @Override
    void setOwner(Customer owner) {
        if (owner.getStatus() == Status.REGULAR){
            this.owner = owner;
        }
    }

    @Override
    boolean withdraw(double amount) {
        if (amount > this.balance + getCreditlimit()){
            System.out.println("You can't withdraw this much");
        }
        return false;
    }
}