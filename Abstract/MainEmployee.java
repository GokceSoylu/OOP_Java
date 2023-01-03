package Abstract;

public class MainEmployee 
{
    public static void main(String[] Soylu)
    {
        Employee[] array={new HourlyEmployee("Jack Sparrow", 1, 30, 35), 
                        new SalariedEmployee("jane", 2, 1800),
                        new ComissionEmployee("tom jerry",3 , 100000, 0.1),
                        new BasePlusComissionEmployee("john zuckerberk", 4, 100000, 0.1, 500)};
        for(Employee e:array)
            System.out.println(e+"  salary: "+e.earning());
    }
}
