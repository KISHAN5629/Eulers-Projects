public class E_p_9 {

	public static void main(String[] args) {
		System.out.println(new E_p_9().check());

	}
	int per=1000;
	public String  check() {
		for (int a = 1; a <per; a++) {
			for (int b =a+1; b <per; b++) {
				int c=per-a-b;
				if(a*a+b*b==c*c) {
					return Integer.toString(a*b*c);
			                }
			
		}
		
	}
	return check();
	}
}

