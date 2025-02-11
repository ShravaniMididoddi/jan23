package Demo;

public class PrimeNoV6 {

	public static void main(String[] args) {
		for(int i=1,k=0;i<=100;i++) {
			int num=i,c=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0) c++;
			}
			if(c==2) {
				System.out.println(num+" ");
				if(++k%8==0) {
					System.out.println(" ");
				}//if k
			}//if c
		}//for i
	}//for main
}//class