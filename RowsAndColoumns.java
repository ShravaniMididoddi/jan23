package Demo;

public class RowsAndColoumns {

	public static void main(String[] args) {
		for (int r = 5; r >= 1; r--) { // 5 //for(int r=1;r<=5;r++)
			for (int c = 5; c >= r; c--) { // 5>=5 //for(int c=1,p=1;p<=r;c++,p++)
				System.out.print(c + " "); // Prints(5)
			}
			System.out.println();
		}

	}

}
