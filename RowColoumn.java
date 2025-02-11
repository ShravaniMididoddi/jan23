package Demo;

public class RowColoumn {

	public static void main(String[] args) {
		for (int r =5; r>=1; r--) { // 5
			for (int c = 5; c>=6-r; c--) { // 5>=6-5,4>=6-4,3>=6-3,2>=6-2,1>=6-1
				System.out.print(c + " "); // Prints(5)
			}
			System.out.println();
		}

	}

}