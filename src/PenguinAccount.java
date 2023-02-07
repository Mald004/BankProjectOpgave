public class PenguinAccount extends BankAccount{

    public PenguinAccount(double balance, Customer owner) {
        super(balance, owner);
    }


    @Override
    public void setOwner(Customer owner) {
        if (owner.getStatus() == Status.CHILD){
            this.owner = owner;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > this.balance){
            System.out.println("Not enough money");
            return false;
        } else {
            System.out.println("You withdrew:" + amount);
            balance = balance - amount;
        }
        return true;
    }
}
