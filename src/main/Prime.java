package main;
import java.util.ArrayList;
import java.util.List;


/**
* This program counts the sum and the number of prime (int) numbers in interval 0-1000
*/
public class Prime 
{
    private List<Integer> primes;
    
    public Prime(int firstNumber, int lastNumber) 
    {
        primes = new ArrayList<>();
        calculatePrimes(firstNumber, lastNumber);
    }

    private boolean numIsPrime(int n, int i) 
    {
        if (n <= 2) return (n==2) ? true : false;

        if(n % i == 0) return false;
        
        if(i*i>n) return true;

        return numIsPrime(n, i+1);
    }

    private void calculatePrimes(int current, int stop)
    {
    	if(current < stop && current >= 0 && stop <= 1000) 
    	{
        	while(current < stop) 
        	{
        		if(numIsPrime(current,2)) primes.add(current);
        		current++;
        	}
    	}
    }

    public List<Integer> getPrimes() 
    {
        if (primes.size() > 0) return primes;
        else return null;
    }
    
    public String printCount() {
    	
    	if (primes.size() > 0) return "Hey, there are " + primes.size() + " prime numbers between 0 and 1000!";
        else return "Oops, wrong interval specified!";
    }
    
    public String printSum() 
    {
    	if (primes.size() > 0) 
    	{
    		int sum = 0;
    		for(int x : primes) sum += x;
    		return "And the total sum of these prime numbers is " + sum + ".";
    	} 
        else return "Oops, wrong interval specified!";
    }
}
