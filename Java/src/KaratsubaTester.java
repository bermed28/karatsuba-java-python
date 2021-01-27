import static org.junit.Assert.*;

import java.util.Random;

import org.junit.*;

public class KaratsubaTester {

	long[] numbers;
	Random rand;
	
	
	@Before
	public void setup() {
		
		numbers = new long[12];
		rand = new Random();
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (long) rand.nextLong();
		}
	}
	
	
	@Test
	public void testBaseCase1() {
		int a = 1234;
		int b = 5678;
		

		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.println("Expected Base Result 1: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	

	@Test
	public void testBaseCase2() {
		int a = 1000;
		int b = 1000;
		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.println("Expected Base Result 2: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	
	@Test
	public void test1() {
		long a = numbers[0];
		long b = numbers[11];
	
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.print("Case 1: " + a + " * " + b  + " - ");
		System.out.println("Expected Result 1: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	
	@Test
	public void test2() {
		long a = numbers[1];
		long b = numbers[10];
		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.print("Case 2: " + a + " * " + b  + " - ");
		System.out.println("Expected Result 2: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	@Test
	public void test3() {
		long a = numbers[2];
		long b = numbers[9];
		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.print("Case 3: " + a + " * " + b  + " - ");
		System.out.println("Expected Result 3: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	@Test
	public void test4() {
		long a = numbers[3];
		long b = numbers[8];
		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.print("Case 4: " + a + " * " + b  + " - ");
		System.out.println("Expected Result 4: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	@Test
	public void test5() {
		long a = numbers[4];
		long b = numbers[7];
		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.print("Case 5: " + a + " * " + b  + " - ");
		System.out.println("Expected Result 5: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}
	
	@Test
	public void test6() {
		long a = numbers[5];
		long b = numbers[6];
		
		long expectedResult = a * b;
		long userResult = KaratsubaAlgorithm.multiply(a, b);
		System.out.print("Case 6: " + a + " * " + b  + " - ");
		System.out.println("Expected Result 6: " + expectedResult + ", got " + userResult);
		assertTrue("Failed to multiply correctly " 
					+ a + " and " + b 
							+ " - Expected " + expectedResult + ", got " + userResult, userResult == expectedResult);
	}

}
