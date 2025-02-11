package Demo;

public class PrimeNoV1 {

	public static void main(String[] args) {
		int n= 6,r,c=0;
		for(int i=1;i<=n;i++) {
			r= n%i;
			if(r==0) 
				c++;
		}
		if(c==2) 
			System.out.println("yes");
		else 
			System.out.println("no");

	}

}
