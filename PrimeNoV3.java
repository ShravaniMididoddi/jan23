package Demo;

public class PrimeNoV3 {
	 static boolean isPrime(int n) {
		 int c=0;
	 for(int i=1;i<=n;i++) {
		 if (n %i==0) c++;
	}
	if(c==2) 
		return true;
	else 
		return false;
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(isPrime(i)==true) {
				System.out.print(i+" ");
			}
	}
}}
