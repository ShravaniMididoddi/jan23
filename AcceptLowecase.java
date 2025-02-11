package Demo;

import java.util.Scanner;

public class AcceptLowecase {

	public static void main(String[] args) {
		//Write a program accept lowcase letters only
		 char ch;
		 Scanner sc= new Scanner(System.in); //Right click--->Source--->Organize Imports
		 char cod;
		 do {
			 System.out.println("Please enter the character:");
			 ch= sc.next().charAt(0);
			 if((ch>='A')&&(ch<='Z')) {
				 System.out.println((ch>='a')&&(ch<='z'));
			 }
			 if((ch>='a')&&(ch<='z')) {
				 System.out.println("ch is lower case");
			 }
			 System.out.println("Do you want to repeat?/n");
			 System.out.println("If yes press y\n");
			 System.out.println("If no press n");
			 cod = sc.next().charAt(0);
		 }while(cod=='y');{
			 System.out.println("Program Ends");
		 }
	}
}