public class E_p_7{
public static boolean checkPrime(int a)
{ 
int c=0;
for(int i=0;i<=(long)Math.sqrt(a);i=i+2)
{
if(a%i==0)
c++;
if(c>1)
return false;
}
return true;
}
public static void main (string[]args){
int n=1;
for(int i=2;i>0;i++)
{
if(checkPrime(i)==true){
n++;
}
if(n==10001){
System.out.println("The 10001 prime number is "+i);
break;
     }
   }
  }
}
