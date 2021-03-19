
public class Programs{
	public void fibnocci(int n) {
	int a=0,b=1,c;
	System.out.print(a +" "+ b);
	for(int i=3;i<=n;i++) {
		c= a+b;
		System.out.print(" "+ c);
		a=b;
		b=c;
	}
	}
	public void isprime(int n) {
		int Count = 0;
		for (int i=1;i<=n;i++) {
			int temp= n%i;
			if(temp==0) {
			Count++;
		}}
		if(Count<=2) {
			System.out.println(n + " is a prime number");
		}else {System.out.println(n + " is not a prime");}
	}
	public void palindrome(String s) {
		boolean flag =true;
		int size= s.length();
		for(int i=0; i<=size/2;i++) {
			 if(s.charAt(i) != s.charAt(size-i-1)){    
	                flag = false;    
	                break;    
	            }   
		}
		if(flag) {
			System.out.println(s + " is a Palindrome");
		}
	}
	public void Armstrong(int n) {
		int c=0,a,temp;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		if(temp == c) {
			System.out.println(c +"Is a armstrong number");
		}
	}
	public static void main(String args[]) {
		Programs pgm = new Programs();
		//pgm.fibnocci(10);
		//pgm.isprime(13);
		//pgm.palindrome("TET");
		pgm.Armstrong(153);
	}
}
