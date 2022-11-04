package Nasted_clases.innerClases;

public class Private_constructer 
{
    String name;
    public void the_inner(int data)
    {
        Inner i=new Inner(data);
    }
    class Inner
    {
        private int data;
        private int counter;
        private Inner(int data)
        {
            this.data=data;
        }
    }
}
