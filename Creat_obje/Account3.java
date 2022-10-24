package Creat_obje;
import java.util.*;
public class Account3
{
    private double balance;
    private String ownerName;
    private int pasword, counter;
    
    public Account3(String ownerName, double balance, int pasword)
    {
        this.ownerName=ownerName;
        this.balance=balance;
        this.pasword=pasword;
    }
    public void setName(String ownerName)
    {
        this.ownerName=ownerName;
    }
    public String getName()
    {
        return ownerName;
    }
    public double getBalance()
    {
        return balance;
    }
    public void add(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        counter=0;
        System.out.printf("%nplease enter the password ");
        Scanner in=new Scanner(System.in);
        do
        {
            int p=in.nextInt();
            if(p==pasword)
            {
                balance-=amount;
                break;
            }    
            else
                System.out.println((counter+1)+" wrong entry");
            counter++;
        }while(counter<3);
        if(counter==3)
            System.out.printf("%nmax limit was reached. Try agin later");
        in.close();
    }
    public void setPasword(int pasword)
    {
        this.pasword=pasword;
    }

}
