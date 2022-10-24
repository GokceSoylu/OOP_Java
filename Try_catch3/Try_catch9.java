package Try_catch3;
public class Try_catch9 
{
    int n1, n2, result;

    public int devide()
    {
        try
        {
            result=n1/n2;
            throw new Exception("connat devide by zero  ");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
