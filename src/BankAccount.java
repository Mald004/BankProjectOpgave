public abstract class BankAccount {
    protected double balance;
    protected Customer owner;

    public BankAccount(double balance, Customer owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public abstract void setOwner(Customer owner);

    public abstract boolean withdraw(double amount);

    public int getId() {

        return getOwner().getId();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getOwner() {
        return owner;
    }

}
