//euler problem 6

class euler_q_6 {

	public static void main(String[] args) {
		System.out.println(new euler_q_6().result());
	}
	  int N = 100;
	
	public String result() {
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
			sum2 += i * i;
		}
		return Integer.toString(sum * sum - sum2);
	}
	
}


