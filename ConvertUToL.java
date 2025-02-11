package Demo;

import java.util.Scanner;

public class ConvertUToL {

	public static void main(String[] args) {//Write a program to check wether its an uppercase or a lowercase letter
		 char ch;
		 Scanner sc= new Scanner(System.in); //Right click--->Source--->Organize Imports
		 char cod;
		 int upAsc = (int)'A';
		 int lowAsc = (int)'a';
		 int diff = upAsc-lowAsc;
		 if(diff<0) diff=-diff;
		 do {
			 System.out.println("Please enter the character:");
			 ch= sc.next().charAt(0);
			 if((ch>='A')&&(ch<='Z')) {
				 System.out.println("Character is Uppercase"); 
				 ch=(char)(ch+diff);
			 }
			 else if((ch>='a')&&(ch<='z')) {
				 System.out.println("ch is lower case");
				 ch=(char)(ch-diff);
			 }
			 System.out.println("After Conversion--->"+ch);
			 System.out.println("Do you want to repeat?/n");
			 System.out.println("If yes press y");
			 System.out.println("If no press n");
			 cod = sc.next().charAt(0);
		 }while(cod=='y');
	}

}

