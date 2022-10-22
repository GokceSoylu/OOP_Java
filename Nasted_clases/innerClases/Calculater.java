package Nasted_clases.innerClases;

public class Calculater 
{
    private final double pi=3.14;
    public void print()
    {
        System.out.println("dis sinif");
    }
    public class Summation
    {
        public int sum(int a, int b)
        {
            return a+b;
        }
        public int sum(int a, int b, int c)//arada overload'da attik :))
        {
            return a+b+c;
        }
    }
    public class Substraction
    {
        public int sub(int a, int b)
        {
            return a-b;
        }
    }
    public class Area
    {
        public double circle(int r)
        {
            return pi*r*r;
        }
        public int rectangle(int a, int b)
        {
            return a*b;
        }
    }


}

