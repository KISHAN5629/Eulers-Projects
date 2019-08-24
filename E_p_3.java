 /*eulers proect problem-3*/
public class pf {
	public static void main(String[] args) {
		System.out.println(new pf().run());
	}
	public String run() {
		long n = 600851475143L;
		while (true) {
			long p = smallestFactor(n);
			if (p < n)
				n=n/p;
			else
				return Long.toString(n);
		}
	}
	private static long smallestFactor(long n) {
		if (n <= 1)
			throw new IllegalArgumentException();
		double end = Math.sqrt(n);
		for (long i = 2; i <= end; i++) {
			if (n % i == 0)
				return i;
		}
		return n;
	}
	
}