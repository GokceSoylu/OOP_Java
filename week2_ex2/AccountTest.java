package week2_ex2;
import java.util.*;

public class AccountTest 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        Account a1;
        a1=new Account("sami",23.00);
        
        System.out.println("name "+a1.getOwnerName()+"  balance "+a1.getBalance());
        
        System.out.println();
        System.out.print("kullanicinin yeni ismi ");
        String name=in.nextLine();
        a1.setOwnerName(name);
        
        System.out.print("eklemek istediginiz miktar ");
        a1.add(in.nextDouble());

        System.out.println();
        System.out.print("cekmek istediğiniz para miktari");
        a1.withdraw(in.nextDouble());

    

        System.out.println();
        System.out.print("name  "+a1.getOwnerName()+"   balnce "+a1.getBalance());
        in.close();
    }
}
