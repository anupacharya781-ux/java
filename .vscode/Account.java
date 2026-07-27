public class Account{
public static void main(String[] args)
{
    private double balance; // Hidden data

    public double getBalance() { // Controlled reading
        return balance;
    }
    public void deposit(double amount) { // Controlled writing
        if(amount > 0) balance += amount;
    }
}
}