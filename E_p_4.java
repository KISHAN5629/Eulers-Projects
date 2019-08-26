//solution of project euler q-4::::
class pallin{
	
	public static void main(String[] args) {
		System.out.println(new pallin().run());
	}
	public String run() {
		int maxPalin = -1;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int prod = i * j;
				String tprod=Integer.toString(prod);
				StringBuilder sb=new StringBuilder(tprod);

				String rev=sb.reverse().toString();
				int v=0;
				if(rev.equals(tprod)){
                    v=1;
				}
				if (v==1 && prod > maxPalin)
					maxPalin = prod;
			}
		}
		return Integer.toString(maxPalin);
	}
	
}
