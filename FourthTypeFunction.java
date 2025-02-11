package Demo;

import java.util.Scanner;

public class FourthTypeFunction {
		static float anyCountryToIndianRupees(String country,int amt) {
			float res= 0.0f;
			if(country.equalsIgnoreCase("USA")) {
				res = amt*78.67f;
			}
			else if(country.equalsIgnoreCase("UK")) {
				res = amt*120.56f;
			}
			else if(country.equalsIgnoreCase("UAE")) {
				res = amt*20.56f;
			}
			return res;
		}
		static int getAmt(){
			return 100;
			}
		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Country: ");
			String country =sc.next();
			String CountryCurrency= getAmtDetails(country);
			System.out.println("Please Enter"+CountryCurrency);
			if(CountryCurrency.equalsIgnoreCase("Country not found")) {
				System.out.println("Not able to process");
			}
			else {
				int amt = sc.nextInt();
				System.out.println("For this "+country+"for this amt="+amt+" indian amt="+ anyCountryToIndianRupees(country,amt));
			}
		}
		static String getAmtDetails(String country) {
			String res = "";
			if(country.equalsIgnoreCase("USA")) {
				res= "Dollar";
			}
			else if(country.equalsIgnoreCase("UK")) {
				res= "Pounds";
			}
			else if(country.equalsIgnoreCase("UAE")) {
				res= "Diram";
			}
			else {
				res= "Country not Found";
			}
			return res;
		}
}