/*eulers proect problem-2*/

class test{
	public static void main(String[] args)  {
	

		int sum=0;
		long lim=4000000l;
		int a=1,b=2;
		int c;
		while(a<lim){
			if(a%2==0)
				sum=sum+a;
		
		c=a+b;
		a=b;
		b=c;

		}
		System.out.println("sum is "+sum);

	}
}