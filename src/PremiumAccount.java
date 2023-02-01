public class PremiumAccount extends BankAccount {

    public PremiumAccount(double balance, Customer owner) {
        super(balance, owner);
    }

    @Override
    public void setOwner(Customer owner) {
        if (owner != null && owner.getStatus() != null && owner.getStatus().equals(Status.VIP)) {
            this.owner = owner;
            owner.accounts.add(this);
        } else {
            throw new RuntimeException("Your not the status VIP");
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount<=0){
            System.out.println("Cant be less than 0");
            return false;
        }
        if(getBalance()-amount>=-5000){
            balance-=amount;
            return true;
        }

        return false;
    }

}
