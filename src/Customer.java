import java.math.BigInteger;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Customer {

    private String name;
    private Status status;
    private int id;
    public ArrayList<BankAccount> accounts;

    public Customer(String name, Status status, int id) {
        this.name = name;
        this.status = status;
        this.id = id;
        accounts = new ArrayList<>();
    }

    void addAccount(BankAccount account){
        accounts.add(account);
    }

    void remove(BankAccount account){
        if (!accounts.contains(account)){
            throw new NoSuchElementException("That account does not exist");
        }
        accounts.remove(account);
        System.out.println("you have removed:" + account);
    }

    void setName(String name){
        String s = "^[a-zA-Z\\s]+";
        if (name.matches(s)){
            this.name = name;
        } else {
            throw new RuntimeException("Only latin letters");
        }
    }

    void setStatus (Status status){
        if (status == Status.ADULT || status == Status.CHILD || status == Status.VIP ){
            this.status = status;
            System.out.println("You status is:" + status);
        } else {
            throw new RuntimeException("You must have a valid status");
        }
    }
    
    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }
}
