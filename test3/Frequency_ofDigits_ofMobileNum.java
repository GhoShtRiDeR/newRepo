package test3;

import java.util.Scanner;

public class Frequency_ofDigits_ofMobileNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number(10 digits): ");
		long input = sc.nextLong();
		int count0, count1, count2, count3, count4, count5, count6, count7, count8, count9;
		count0 = count1 = count2 = count3 = count4 = count5 = count6 = count7 = count8 = count9 = 0;
		while(input>0) {
			long j = input % 10;
			int k = (int) j;
			switch (k) {
			case 1:
				count1++;
				break;
			case 2:
				count2++;
				break;
			case 3:
				count3++;
				break;
			case 4:
				count4++;
				break;
			case 5:
				count5++;
				break;
			case 6:
				count6++;
				break;
			case 7:
				count7++;
				break;
			case 8:
				count8++;
				break;
			case 9:
				count9++;
				break;
			case 0:
				count0++;
				break;
			}
			input = input / 10;
		}
		int number_ofDigits = count0 + count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9;
		if (number_ofDigits == 10) {
			System.out.println("Frequency of:- ");
			System.out.println("zero = " + count0);
			System.out.println("one = " + count1);
			System.out.println("two = " + count2);
			System.out.println("three = " + count3);
			System.out.println("four = " + count4);
			System.out.println("five = " + count5);
			System.out.println("six = " + count6);
			System.out.println("seven = " + count7);
			System.out.println("eight = " + count8);
			System.out.println("nine = " + count9);
		} else {
			System.out.println("Incorrect Input, check the input value.");
		}
	}

}
