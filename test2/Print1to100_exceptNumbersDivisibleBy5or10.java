package test2;

public class Print1to100_exceptNumbersDivisibleBy5or10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (j == 2) {
					break;
				}
				j++;
			}
			System.out.println(i);
		}

	}

}
