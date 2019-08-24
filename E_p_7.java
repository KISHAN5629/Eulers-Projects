
public class euler_q_7 {
	public static String prime() {
		
				
		for (int i = 2, count = 0; ; i++) {
			if (Library.isPrime(i)) {
				count++;
				if (count == 10001)
					return Integer.toString(i);
			}
		}
				
			
		
	
		return Integer.toString(0);
		}
	public static void main(String[] args) {
		System.out.println(new euler_q_7().prime());
	}

}