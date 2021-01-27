
public class KaratsubaAlgorithm {
	
	
	public static void main(String[] args) {
		
		System.out.println("7006652 == " + multiply(1234,5678));
		
	}
	
	public static long multiply(long x, long y) {
		
		String strX = String.valueOf(x);
		String strY = String.valueOf(y);
		
		int lengthX = strX.length();
		int lengthY = strY.length();
		
		int N = Math.max(lengthX, lengthY);
		
		if(x < 10 || y < 10) return x * y;
		
		int exp = Math.floorDiv(N, 2);
		
		long a = Math.floorDiv(x, (long) Math.pow(10, exp));
		long b = Math.floorMod(x, (long) Math.pow(10, exp));
		long c = Math.floorDiv(y, (long) Math.pow(10, exp));
		long d = Math.floorMod(y, (long) Math.pow(10, exp));
		
		long ac = multiply(a, c);
		long bd = multiply(b, d);
		
		
		long a_b_c_d = multiply(a+b, c+d) - ac - bd;
		
			
		return (long) (ac*(Math.pow(10, exp*2)) + a_b_c_d*(Math.pow(10, exp)) + bd);

				
		
	}
	
	

}
