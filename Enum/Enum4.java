package Enum;
enum Enum4 //başına public'te yazabilirim ama yazmasamda public kabul eder. enum için kabul edilir tek access modifier public'tir. Evet private fln yazsak hata alırız:)
{
    ns(18, 8, 2000, "kahverengi"), 
    ss(15, 8, 1999, "kahverengi");
    //todo bir nevi içerisine sabit obje oluşturuyoruz
    
    int day, month, year;
    private String eye_colour;
    Enum4(int day, int month, int year, String eye_colour)
    {
        this.day=day;
        this.month=month;
        this.year=year;
        this.eye_colour=eye_colour;
    }
    public void set_day(int day)
    {
        if(day>=1 && day<=31) this.day=day;
    }
}
