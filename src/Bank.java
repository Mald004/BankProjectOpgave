public class Bank {

    boolean transferMoney(BankAccount from, BankAccount to, double amount){
        if (amount <= from.balance){
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("You have transferred: " + amount);
            return true;
        }
        if (from == null || to == null){
            throw new NullPointerException("You must have an account");
        } else if (amount > from.balance){
            System.out.println("Transfer failed");
        } return false;
    }
}