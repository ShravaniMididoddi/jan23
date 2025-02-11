package Demo;

public class ThirdTypFunc {
	int maxDigit() {
		return 9;
	}
	boolean indianMustHaveAadhar() {
		return true;
	}
	static float usDollar() {
		float rupees = 78.67f;
		return rupees;
	}
	char appleFirstChar() {
		return 'A';
	}
	String indiaCapital() {
		return "Delhi";
	}
	public static void main(String[] args) {
		float indToUsDollar = usDollar();
		System.out.println("Indian rupees of US Dollars--->"+indToUsDollar);
	}

}