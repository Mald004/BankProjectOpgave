public class Main {

    public static void main(String[] args) {

        Customer Far = new Customer("Far",Status.REGULAR,1);
        Customer Søn = new Customer("Søn",Status.CHILD,2);
        Far.accountsHashSet.add(Far);
        //Søn.accountsHashSet.add(Søn);

        SalaryAccount salaryAccount = new SalaryAccount(100,Far,1);
        Far.accountsHashMap.put(Far,salaryAccount );
       // System.out.println(Søn.accountsHashSet);
        System.out.println(Far.accountsHashMap);



        //BankAccount salaryAccount = new SalaryAccount(100,Far,1);
        //BankAccount penguinAccount = new PenguinAccount(0,Søn);


        //Bank bank = new Bank();
        //bank.transferMoney(salaryAccount,penguinAccount,15);
        //System.out.println(penguinAccount.balance);
    }
}