public class PenguinAccount extends BankAccount{
    public PenguinAccount(double balance, Customer owner) {
        super(balance, owner);
    }

    @Override
    public void setOwner(Customer owner) {
        if(this.owner.getStatus().equals(Status.CHILD)){
            this.owner = owner;
            owner.accounts.add(this);
        }else{
            throw new RuntimeException("Your not a child");
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount<=0){
            System.out.println("Cant be less than 0");
            return false;
        }
        if(getBalance()-amount>=0){
            balance-=amount;
            return true;
        }

        return false;
    }
}
