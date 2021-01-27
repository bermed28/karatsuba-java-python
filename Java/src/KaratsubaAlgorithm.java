
public class KaratsubaAlgorithm {
	
	
	public static void main(String[] args) {
		
		/*Base Test*/
		System.out.println("7006652 == " + multiply(1234,5678));
		
	}
	
	/**
	 * KARATSUBAS ALGORITHM
	 * 
	 * Algorithm to multiply two numbers in O(n^1.6) running time
	 * Compared to grade-school multiplication algorithm which is O(n^2) running time
	 * 
	 * @author bermed28
	 * @param x
	 * @param y
	 * @return the product between x and y
	 */
	public static long multiply(long x, long y) {
		
		String strX = String.valueOf(x);
		String strY = String.valueOf(y);
		
		int lengthX = strX.length();
		int lengthY = strY.length();
		
		
		int N = Math.max(lengthX, lengthY);
		
		
		/*If x or y are one digit numbers then you can multiply them directly*/
		if(x < 10 || y < 10) return x * y;
		
		int exp = Math.floorDiv(N, 2);
		
		
		/*Split x (a,b) and y (c,d) in 2 halves*/
		long a = Math.floorDiv(x, (long) Math.pow(10, exp));
		long b = Math.floorMod(x, (long) Math.pow(10, exp));
		long c = Math.floorDiv(y, (long) Math.pow(10, exp));
		long d = Math.floorMod(y, (long) Math.pow(10, exp));
		
		
		/**
		 * Recursively compute the three multiplications needed to reduce running time to O(n^1.6):
		 * 
		 *     (a * c)  
		 *     (b * d)
		 *     (a + b)(c + d) = ad + cb
		 */
		long ac = multiply(a, c);
		long bd = multiply(b, d);
		long a_b_c_d = multiply(a+b, c+d) - ac - bd;
		
		
		/*Return formula ac*10^(n/2) + (ad + cb)*10^(n/2) + bd*/	
		return (long) (ac*(Math.pow(10, exp*2)) + a_b_c_d*(Math.pow(10, exp)) + bd);

				
		
	}
	
	

}
