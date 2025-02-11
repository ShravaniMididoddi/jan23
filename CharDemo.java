package Demo;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		//Write a program to check whether its an uppercase or a lowercase letter
		 char ch;
		 Scanner sc= new Scanner(System.in); //Right click--->Source--->Organize Imports
		 char cod;
		 do {
			 System.out.println("Please enter the character:");
			 ch= sc.next().charAt(0);
			 if((ch>='A')&&(ch<='Z')) {
				 System.out.println("ch is upper case");
			 }
			 if((ch>='a')&&(ch<='z')) {
				 System.out.println("ch is lower case");
			 }
			 System.out.println("Do you want to repeat?/n");
			 System.out.println("If yes press y\n");
			 System.out.println("If no press n");
			 cod = sc.next().charAt(0);
			 System.out.println("Progeam Ends");
		 }while(cod=='y');
	}

}//if(cod== 'n') cod=0;
//else cod= 1;
//while(cod==1);
//sysout("Ends");
