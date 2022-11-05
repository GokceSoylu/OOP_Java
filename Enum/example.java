package Enum;

enum Branch 
{
    math("info about math"), 
    physics("info about phy"), 
    computer("info about software"), 
    eng("info about eng");
    //bu sabit instance'ların en üstte olması gerekiyor.
    private String info;
    Branch(String info)
    {
        this.info=info;
    }
    void get_info()
    {
        System.out.println(info);
    }
}
