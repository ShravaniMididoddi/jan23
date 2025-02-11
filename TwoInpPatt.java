package Demo;

public class TwoInpPatt {
		static void pattern(char ch1, int num1,char ch2, int num2) {
			System.out.println("***************");
			System.out.println("---------------");
			for(int i=1;i<=num1;i++)
				System.out.print(ch1);
				System.out.println("\n");
			for(int i=1;i<=num2;i++)
				System.out.print(ch2);
				System.out.println("\n");
		}
		public static void main(String[]args) {
			
			pattern ('*',25,'^',34);
			System.out.println("Welcome");
			pattern ('-',20,'^',24);
			System.out.println("Hyderabad");
			pattern ('.',16,'^',34);
			System.out.println("St.Peters Engg College");
		}

	}