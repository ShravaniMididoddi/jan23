package Demo;

public class PrimeNoV5 {

	public static void main(String[] args) {
		// 1...100
		for (int i = 1, k = 0; i <= 100; i++) {
			int num = i, c = 0;
			for (int p = 1; p <= num; p++) {
				if (num % p == 0)
					c++;
			} // for p
			if (c == 2) {
				System.out.println(num + " ");
				k = 0;
			} // k
		}
	}
}
