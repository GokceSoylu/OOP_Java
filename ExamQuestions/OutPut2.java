package ExamQuestions;

public class OutPut2 {}
class Computer {
    static int counter;
    int year;
    String model;
    public Computer(int year, String model) {
            this.year = year;
            this.model = model;
            counter++;
        }
        @Override
        public String toString() {
            return model+year;
        }
    }
    class Desktop extends Computer{ int id;
    int memorySize;
    public Desktop(int year, String model) {
            super(year, model);
            this.id=counter;
        }
    public void setMemory(int memorySize){ this.memorySize=memorySize;
    }
    @Override
    public String toString() {
return id+". "+super.toString()+". Memory:"+memorySize; }
}
class Laptop extends Computer
{ 
    int memorySize;
    int id;
    public Laptop(int year, String model) 
    {
        super(year, model);
        this.id=counter;
        
    }
    public void setMemory(int memorySize)
    { 
        this.memorySize=memorySize;
    } 
    @Override
    public String toString() 
    {
        return id+". "+super.toString()+". Memory:"+memorySize;
    } 
}
class ExamMainClass 
{
    public static void main(String[] args) 
    { 
        Computer c1= new Desktop(2019,"Dell XPS"); ((Desktop)c1).setMemory(16);
        Computer c2= new Laptop(2020,"MacBook"); ((Laptop)c2).setMemory(32);
        Computer c3= new Desktop(2017,"iMac"); ((Desktop)c3).setMemory(16); Computer[] computers={c1,c2,c3};
        for(Computer c:computers) System.out.println(c); // (o1 to o3)
        System.out.println(Computer.counter); // (o4)
        System.out.println(((Laptop)computers[1]).id); // (o5) }
    }
}