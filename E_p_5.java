	import java.math.BigInteger;
 class eulers_q_5{
		
		public static void main(String[] args) {
			System.out.println(new eulers_q_5().div());
		}
		public String div() {
			BigInteger tlc = BigInteger.ONE;
			for (int i = 1; i <= 20; i++)
				tlc = lcm(BigInteger.valueOf(i), tlc);
			return tlc.toString();
		}
		
		
		static BigInteger lcm(BigInteger x, BigInteger y) {
			return x.divide(x.gcd(y)).multiply(y);
		}
		
	}

