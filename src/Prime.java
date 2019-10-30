import java.util.Scanner;


public class Prime {
	
	private Scanner scanner;

	public static void main (String args[]) 
	{
		Prime prime = new Prime();
		int n = prime.scan();
		System.out.println("Is the number " + n + " prime? " + isPrime(n));
	}
	
	public int scan() 
	{
		System.out.print("Please enter a positive integer: ");
		
		
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		while (n <= 0) 
		{
			System.out.println("You should use a positive integer!");
			System.out.println();
			System.out.print("Please enter a positive integer: ");
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
		}
		
		return n;
	}
	
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int checkPrimeUptoNumber() 
	{
		System.out.print("Enter a number for N: ");
		
		
		scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		while (n <= 0) 
		{
			System.out.println("You should use a positive integer!");
			System.out.println();
			System.out.print("Please enter a positive integer: ");
			scanner = new Scanner(System.in);
			n = scanner.nextInt();
		}
		
		return n;
	}
	
	public static boolean isPrime(int n) 
	{
		if (n <= 0) 
		{
			System.out.println("You should use a positive number.");
			return false;
		}
		
		int divisor = 2;
        while(divisor < n ) 
        {
            if(n % divisor == 0)
            {
            	return false;
            }
            
            divisor = divisor + 1;
        }
        
        return true;
	}
	
}
