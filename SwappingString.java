package Demo;

public class SwappingString {

	public static void main(String[] args) {
		String name1= "Ramu";
		String name2= "Abdul";
		System.out.println("Before Swapping : ");
		System.out.println("Name1 : "+name1);
		System.out.println("Name2 : "+name2);
		
		name2 = name2+name1;
		name1 = name2.substring(0,name2.length()-name1.length());
		name2 = name2.substring(name1.length());
		System.out.println("After Swapping : ");
		System.out.println("Name1 : "+name1);
		System.out.println("Name2 : "+name2);
	}

}
