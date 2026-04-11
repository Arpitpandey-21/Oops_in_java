public class BankAccount {
    private long Accountnumber;
    public long getAccountnumber() {
        return Accountnumber;
    }
    public void setAccountnumber(long accountnumber) {
        Accountnumber = accountnumber;
    }
    private double balance;
    public double getBalance() {
        return balance;
    }
   
    public void deposits(double Amount)
    {
        if(Amount > 0)
        {
            balance += Amount;
            System.out.println("deposited = " + Amount);
        }
        else{
            System.out.println("Invalid deposits amount");
        }
    }
    public void withdraw(double Amount)
    {
        if(balance > 0 && Amount <= balance)
        {
            balance -= Amount;
            System.out.println("Withdrew = " + Amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposits(1000);
        bank.withdraw(500);
        bank.deposits(700);
        bank.withdraw(133);
        System.out.println(bank.getBalance());
    }
}
