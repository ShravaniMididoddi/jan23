package Demo;

public class SwappingString1 {

	public static void main(String[] args) {
		String name1= "Ramu";
		String name2= "Abdul";
		System.out.println("Before Swapping : ");
		System.out.println("Name1 : "+name1);
		System.out.println("Name2 : "+name2);
		
		name1 = name1+name2;
		name2 = name1.substring(0,name1.length()-name2.length());
		name1 = name1.substring(name2.length());
		System.out.println("After Swapping : ");
		System.out.println("Name1 : "+name1);
		System.out.println("Name2 : "+name2);
	}

}
