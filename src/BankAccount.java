abstract class BankAccount   {

    protected double balance;
    protected Customer owner;

    public BankAccount(double balance, Customer owner) {
        this.balance = balance;
        this.owner = owner;
    }

    abstract void setOwner(Customer owner);
    abstract boolean withdraw(double amount);
    int getId(){
        return owner.getId();
    }
    public void deposit(double amount){
        balance = balance + amount;
    }

    public double getBalance(){
        return balance;
    }

    public Customer getOwner(){
        return owner;
    }



}