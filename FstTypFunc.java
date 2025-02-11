package Demo;
public class FstTypFunc {
	static void pattern(char ch, int num) {
		System.out.println("***************");
		System.out.println("---------------");
		for(int i=1;i<=num;i++)
		System.out.print(ch);
		System.out.println("\n");
	}
	public static void main(String[]args) {
		
		pattern ('*',25);
		System.out.println("Welcome");
		pattern ('-',20);
		System.out.println("Hyderabad");
		pattern ('.',16);
		System.out.println("St.Peters Engg College");
	}

}
