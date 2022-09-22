package test2;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1, r = 5; i <= 5; i++, r--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= r; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
