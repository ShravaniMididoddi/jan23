package Demo;

public class NumberPattern1 {

	public static void main(String[] args) {
		for(int r=1,sp=20;r<=5;r++) {
			for(int k=1;k<sp;k++) {
				System.out.print(" ");
			}
			sp=sp-1;
			for(int c=1;c<=r;c++) {
				System.out.print(r+"  ");
			}
			System.out.println();
		}

	}

}
