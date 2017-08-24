public class Time
{
    private int hour;
    
    private int minute;
    
    private int second;
    
    public Time()
    {
        setTime(System.currentTimeMillis());
    }
    
    public Time(long time)
    {
        setTime(time);
    }
    
    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public int getSecond()
    {
        return second;
    }
    
    public void setTime(long time)
    {
        long dayInMillis = 86400000;
        int hourInMillis = 3600000;
        int minuteInMillis = 60000;
        int secondInMillis = 1000;
        
        hour = (int)((time % dayInMillis) / hourInMillis);
        minute = (int)((time % hourInMillis) / minuteInMillis);
        second = (int)((time % minuteInMillis) / secondInMillis);
    }
}
