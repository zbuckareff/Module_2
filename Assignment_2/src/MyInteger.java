/**
 *  MyInteger class contains a <b>int</b> value property that stores an integer defined by the
 *  <i>MyInteger(<b>int</b> value)</i> constructor.  Also contains instance and static methods for
 *  determining whether the instance <i>value</i> or the integer argument is even, odd, or prime.
 */
public class MyInteger
{
    private int value;
    
    public MyInteger(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    public boolean isEven()
    {
        return MyInteger.isEven(this.value);
    }
    
    public static boolean isEven(int value)
    {
        if (value % 2 == 0)
        {
            return true;
        }
        
        return false;
    }
    
    public boolean isOdd()
    {
        return MyInteger.isOdd(this.value);
    }
    
    public static boolean isOdd(int value)
    {
        if (value % 2 != 0)
        {
            return true;
        }

        return false;
    }
    
    public boolean isPrime()
    {
        return MyInteger.isPrime(this.value);
    }
    
    public static boolean isPrime(int value)
    {
        if (value == 2)
        {
            return true;
        }
        else if (value <= 1 || (value % 2) == 0)
        {
            return false;
        }
            
        for (int i = 3; (int)Math.pow(i, 2) <= value; i += 2)
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean equals(int value)
    {
        if (this.value == value)
        {
            return true;
        }
        
        return false;
    }
    
    public boolean equals (MyInteger myInteger)
    {
        if (this.value == myInteger.getValue())
        {
            return true;
        }
        
        return false;
    }
    
    public static int parseInt(char[] charArray)
    {
        int chValue = 0;
        
        for (char ch : charArray)
        {
            chValue += (int)ch;
        }
        
        return chValue;
    }
    
    public static int parseInt(String stringValue)
    {
        return Integer.parseInt(stringValue);
    }
}
