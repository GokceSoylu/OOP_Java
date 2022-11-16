public class generealExample
{
    public static void main(String[] Soylu)
    {
        Worker w1=new Worker(1,"elif",100,8);
        Worker w2=new Worker(2,"Tomris",110,8);
        Worker w3=new Worker(3,"Halime",120,8);
        Worker w4=new Worker(4,"kardelen",130,8);
        Worker[] arr=new Worker[]{w1,w2,w3,w4, new Worker(5,"Cengiz",90,8)};

        Company c1=new Company(arr,CompanyName.PTT);
        Company c2=new Company(arr,CompanyName.DHL);
         
        System.out.println(c1.getCompanyNameDesc());//? c1.companyName.getDesc(); demek yerine bir fonksiyon kullandık onu çağırdek boulsi daha iyi
        c1.printAllWorkersAndSalaries();            //? o onu o onu derken program şçin çokta iyi olmaz :))
        System.out.println(c1.getAllSAlaries());

        System.out.println(c2.getCompanyNameDesc());  
        c2.printAllWorkersAndSalaries();
        System.out.println(c2.getAllSAlaries());
    }
}
class Worker
{
    private int id, wages, hours;
    private String name;
    
    Worker(int id, String name, int wages, int hours)
    {
        setId(id);
        setName(name);
        setWages(wages);
        setHours(hours);
    }
    public void setWages(int wages)
    {
        this.wages=wages;
    }
    public void setHours(int hours)
    {
        this.hours=hours;
    }
    int getSalary()
    {
        return wages*hours;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setId(int id)
    {
        this.id=id;
    }
}
class Company
{
    private Worker[] workers;
    CompanyName companyName;
    
    Company(Worker[] workers, CompanyName companyName)
    {
        this.workers=workers;
        this.companyName=companyName;
    }
    int getNumberOfWorkers()
    {
        return workers.length;
    }
    String getCompanyNameDesc()
    {
        return companyName.getDesc();
    }
    void printAllWorkersAndSalaries()
    {
        for(Worker w:workers)
            System.out.println(w.getName()+" "+w.getSalary());
    }
    int getAllSAlaries()
    {
        int sum=0;
        for(Worker w:workers)
            sum+=w.getSalary();
        return sum;
    }
}
enum CompanyName
{
    DHL("This is an Amarican Company"), //! hocam dikkatli olalım enum içerinde yazdığın bu objelerin arsına virgül konur ; değil :))
    PTT("This is an Turkish Company");

    private String description;
    private CompanyName(String description)
    {
        this.description=description;
    }
    public String getDesc()
    {
        return description;
    }
}