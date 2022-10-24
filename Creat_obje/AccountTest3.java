package Creat_obje;
import java.util.Scanner;
public class AccountTest3 
{
    public static void main(String[] Soylu)
    {
        Account3 a1=new Account3("necmiye soylu",100.00,1234);
        System.out.println("name "+a1.getName()+"  balance "+a1.getBalance());

        Scanner in=new Scanner(System.in);
        System.out.println("new name ");
        a1.setName(in.nextLine());
        System.out.println("new pasword ");
        a1.setPasword(in.nextInt());

        System.out.println("how much money will you add ");
        a1.add(in.nextDouble());

        System.out.println("how much money will you take ");
        a1.withdraw(in.nextDouble());

        System.out.println();
        System.out.println("name "+a1.getName()+"   balance "+a1.getBalance());
        in.close();
    }    
}
