package JUnit;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.Prime;

class PrimeTest {

	@Test
	@DisplayName("Constructor, algoritm and getter returns an array with prime numbers between 0 and 20")
	void getPrimeNumbersBetweenZeroAndTwentyTest() {
		List<Integer> primeNumbersBetweenZeroANdTwenty = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
		Prime prime = new Prime(0,20);
		assertEquals(primeNumbersBetweenZeroANdTwenty, prime.getPrimes());
	}
	
	@Test
	@DisplayName("Prime returns null if start integer as input is below zero")
	void getPrimeNumbersAsNullTest() {
		Prime prime = new Prime(-1,20);
		assertNull(prime.getPrimes());
	}
	
	@Test
	@DisplayName("Prime returns null if stop integer as input is over 1000")
	void getPrimeNumbersAsNullTest2() {
		Prime prime = new Prime(0,1001);
		assertNull(prime.getPrimes());
	}
	
	@Test
	@DisplayName("Prime returns null if start integer as input is bigger than stop integer")
	void getPrimeNumbersAsNullTest3() {
		Prime prime = new Prime(20,0);
		assertNull(prime.getPrimes());
	}
	
	@Test
	@DisplayName("Prime doesn't returns null if the input integers are very at the edge as 0 and 1000")
	void getPrimeNumbersAsNonNullTest() {
		Prime prime = new Prime(0,1000);
		assertNotNull(prime.getPrimes());
	}
	
	@Test
	@DisplayName("Count how many prime integers there are between 0 and 1000 and returns as user-friendly text")
	void printCountOfPrimeNumbersBetweenZeroAndAThousand() {
		Prime prime = new Prime(0,1000);
		assertEquals("Hey, there are 168 prime numbers between 0 and 1000!", prime.printCount());
	}
	
	@Test
	@DisplayName("Print count as invalid interval exception as user-friendly text")
	void printCountOfPrimeNumbersAsInvalidInterval() {
		Prime prime = new Prime(-1,10);
		assertEquals("Oops, wrong interval specified!", prime.printCount());
	}
	
	@Test
	@DisplayName("Count sum of all prime integers between 0 and 1000 and returns as user-friendly text")
	void printSumOfPrimeNumbersBetweenZeroAndAThousand() {
		Prime prime = new Prime(0,1000);
		assertEquals("And the total sum of these prime numbers is 76127.", prime.printSum());
	}
	
	@Test
	@DisplayName("Print sum as invalid interval exception as user-friendly text")
	void printSumOfPrimeNumbersAsInvalidInterval() {
		Prime prime = new Prime(800,1200);
		assertEquals("Oops, wrong interval specified!", prime.printSum());
	}
}
