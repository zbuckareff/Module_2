import java.util.Scanner;

public class IntegerTest
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MyInteger intObj1;
        MyInteger intObj2;
        char[] chArray;
        
        System.out.print("Please enter an Integer: ");
        intObj1 = new MyInteger(input.nextInt());
        
        System.out.print("Thank you.  Please enter another Integer: ");
        intObj2 = new MyInteger(input.nextInt());
        
        System.out.println();
        System.out.println("First Number Entered: " + intObj1.getValue());
        System.out.println("Second Number Entered: " + intObj2.getValue());
        
        System.out.println();
        System.out.println("First Number is Even: " + intObj1.isEven());
        System.out.println("First Number is Odd: " + intObj1.isOdd());
        System.out.println("First Number is Prime: " + intObj1.isPrime());
        
        System.out.println();
        System.out.println("Second Number is Even: " + intObj2.isEven());
        System.out.println("Second Number is Odd: " + intObj2.isOdd());
        System.out.println("Second Number is Prime: " + intObj2.isPrime());
        
        System.out.println();
        System.out.println("First Number is the same as Second Number: " + intObj2.equals(intObj1));
        
        System.out.println();
        System.out.print("Enter a number to check if Even: ");
        System.out.println("This is " + MyInteger.isEven(input.nextInt()));
        
        System.out.println();
        System.out.print("Enter a number to check if Odd: ");
        System.out.println("This is " + MyInteger.isOdd(input.nextInt()));
        
        System.out.println();
        System.out.print("Enter a number to check if Prime: ");
        System.out.println("This is " + MyInteger.isPrime(input.nextInt()));
        
        input.nextLine();
        
        System.out.println();
        chArray = getCharArray(input);
        System.out.println("\nYour character string equals the integer " + MyInteger.parseInt(chArray));
        
        System.out.println();
        System.out.print("Please enter a number: ");
        System.out.printf("Thank you. The number you entered was %d", MyInteger.parseInt(input.nextLine()));
    }
    
    public static char[] getCharArray(Scanner input)
    {
        char[] chArray;
        String chString;
        
        System.out.print("Please enter a string of characters: ");
        chString = input.nextLine();
        
        chArray = new char[chString.length()];
        
        for (int i = 0; i < chString.length(); i ++)
        {
            chArray[i] = chString.charAt(i);
        }
        
        return chArray;
    }
}
