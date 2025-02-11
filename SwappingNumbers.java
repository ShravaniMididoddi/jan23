package Demo;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a=100,b=200;
		System.out.println("Before swapping:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+b;//100+200=300 //a=300
		b=a-b;//300-200=100 //b=100
		a=a-b;//300-100=200 //a=200
		
		System.out.println("After Swapping: ");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
