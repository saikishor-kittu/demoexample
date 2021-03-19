package demopackage;

public class javaCode {
	static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(isPrime(131)) {
			System.out.println( "is prime number ");
		}else
		{
			System.out.println("Not a prime number");
		}
		
	}
}
