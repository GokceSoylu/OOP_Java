package week4_ex1;
public class Time1
{
    private int hour, minute, second;
    Time1(int hour, int minute, int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public void setHour(int h)
    {
        if(h>=0 && h<24)
            hour=h;
    }
    public void setMinute(int m)
    {
        if(m>=0 && m<60 )
        {
            minute=m;
        }
    }
    public void setSecond(int s)
    {
        if(s>=0 && s<60)
        {
            second=s;
        }
    }
    public String toUniversalString()
    {
        return String.format("%d : %d : %d",hour,minute,second);
    }
    public String  toString()
    {
        return String.format("%d : %d : %d %s",(hour==12 || hour==0) ? 12:hour%12,minute,second,(hour<12) ? "AM": "PM");
    }
}
