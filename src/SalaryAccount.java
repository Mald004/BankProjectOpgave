public class SalaryAccount extends BankAccount {
    private double creditLimit;

    public SalaryAccount(double balance, Customer owner) {
        super(balance, owner);
    }

    @Override
    public void setOwner(Customer owner) {
        if (owner != null && owner.getStatus() != null && owner.getStatus().equals(Status.ADULT)) {
            this.owner = owner;
            owner.accounts.add(this);
        } else {
            throw new RuntimeException("Your not the status adult");
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount<=0){
            System.out.println("Cant be less than 0");
            return false;
        }

        if(getBalance()-amount>=-creditLimit){
            balance-=amount;
            return true;
        }

        return false;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        if(creditLimit<0){
            throw new RuntimeException("Cant be less than 0");
        }

        this.creditLimit = creditLimit;
    }
}
