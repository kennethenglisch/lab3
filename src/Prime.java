import java.util.Random;
import java.math.BigInteger;



public class Prime {
	
	private Random random;


	public static void main (String args[]) 
	{
		Prime prime = new Prime();
		prime.random = new Random();
		
		prime.bigIntegerAlogrithm(20);
	}
	
	/**
	 * An algorithm to check 100 random BigIntegers of bit length 'bit' if they are prime
	 * 
	 * @param bit The bit length that the BigIntegers should have 
	 */
	public void bigIntegerAlogrithm(int bit) 
	{
		for (int i = 0; i < 100; i++)
		{
			BigInteger bigInt = new BigInteger(bit, random);
			System.out.println("The number " + bigInt + " is prime: " + isPrimeBigInt(bigInt) + " !");	
		}
	}
	
	/**
	 * A method to check if an Integer is prime or not.
	 * 
	 * @param n Integer that is checked if it is prime
	 * @return true if n is prime, false otherwise
	 */
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
	
	/**
	 * A method to check if an BigInteger is prime or not.
	 * 
	 * @param bigInt BigInteger that is checked if it is prime
	 * @return true if bigInt is prime, false otherwise
	 */
	public static boolean isPrimeBigInt(BigInteger bigInt) 
	{
		if (bigInt.compareTo(BigInteger.valueOf(1)) == -1)
		{
			System.out.println("You should use a positive number.");
			return false;
		}
		
		BigInteger divisor = BigInteger.valueOf(2);
		
        while(divisor.compareTo(bigInt) == -1) 
        {
            if(bigInt.mod(divisor) == BigInteger.valueOf(0))
            {
            	return false;
            }
            
            divisor = divisor.add(BigInteger.valueOf(1));
        }
        
        return true;
	}
	
}
