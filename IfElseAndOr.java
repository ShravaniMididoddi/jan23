package Demo;

public class IfElseAndOr {

	public static void main(String[] args) {
		int num=10;
		if((num++>0)&&(++num>5));//In AND condition if the first expression i.e,(n>0) is false then it doesn't execute the next statement
		System.out.println("Positive no---->"+num);
		{
			num++;
			System.out.println("The computed number is:"+num);
	System.out.println("Program Ends");
	}
	}
}
