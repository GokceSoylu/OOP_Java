package Creat_obje;

public class Account2 
{
    private double balance;
    private String ownerName;

    Account2(String ownerName, double balance)
    {
        this.ownerName=ownerName;
        this.balance=balance;
    }
    public void add(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setOwnerName(String name)
    {
        this.ownerName=name;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
}
