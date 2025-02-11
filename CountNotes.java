package Demo;
import java.util.Scanner;
public class CountNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to return:");
		int rupees = sc.nextInt();
		int n10 =0, c5=0 , c2=0,c1=0;
		if(rupees>=10);
		{
			n10 = rupees/10 ;
			rupees = rupees%10;
		
		}
		if(rupees>5);
		{
			c5 = rupees/5;
			rupees = rupees%5;
		}
		if(rupees>2);
		{
			c2 = rupees/2;
			rupees = rupees%2;
		}
		if(rupees>1);
		{
			c1 = rupees/1;
			rupees = rupees%1;
		}
		System.out.println("Number of 10Rs Notes--->"+n10);
		System.out.println("Number of 5Rs Coins--->"+c5);
		System.out.println("Number of 2Rs Coins--->"+c2);
		System.out.println("Number of 1Rs Coins--->"+c1);
		System.out.println("Remaining Amount:"+rupees);

	}

}
