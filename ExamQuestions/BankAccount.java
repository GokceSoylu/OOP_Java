package ExamQuestions;
import java.util.*;
public class BankAccount implements Comparable<BankAccount>
{
    int accountNo;
    String holderName;
    double balance;
    BankAccount(int accountNo, String holderName, double balance)
    {
        this.accountNo=accountNo;
        this.balance=balance;
        this.holderName=holderName;
    }    
    void balanceChange(double amount)
    {
        balance=-amount;
    }
    public int compareTo(BankAccount o)
    {
        return holderName.compareTo(o.holderName);
    }
}
class MainBank
{
    public static void main(String[] Soylu)
    {
        BankAccount a1=new BankAccount(1, "eren", 100);
        BankAccount a2=new BankAccount(2, "ertan", 24);
        BankAccount a3=new BankAccount(3, "halil", 4000);
        BankAccount a4=new BankAccount(4, "elif", 3000);

        ArrayList<BankAccount> list=new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        Collections.sort(list);
        Iterator<BankAccount> itr=list.iterator();
        BankAccount o;
        while(itr.hasNext())
        {
            //o=((BankAccount)itr.next());
            ((BankAccount)itr).balanceChange(50);
            System.out.println(((BankAccount)itr).holderName+"  "+((BankAccount)itr).balance);
        }
    }
}//kısaca itr.next() obje döndürüyor ancak ulaşma için down casting yapmalıyız