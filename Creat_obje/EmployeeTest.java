package Creat_obje;
import java.util.*;
public class EmployeeTest 
{
    public static void main(String[] Soylu)
    {
        Scanner in=new Scanner(System.in);
        
        Employee e1=new Employee();
        e1.name="hasan";
        e1.socialSecurityNumber=12345;
        e1.wage=10f;
        e1.workingHours=40;

        e1.displayInfo();
        e1.printSalary();

        Employee e2;
        e2=new Employee();
        e2.name=in.nextLine();
        e2.socialSecurityNumber=in.nextInt();
        e2.wage=in.nextFloat();
        e2.workingHours=in.nextInt();

        e2.displayInfo();
        e2.printSalary();
        in.close();
    }    
}
