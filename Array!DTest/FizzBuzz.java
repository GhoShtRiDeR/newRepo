package test6;

import java.util.Scanner;

/*Write a  program that prints the numbers
from 1 to 50. But for multiples of three print “buzz” instead of the
number and for the multiples of five print “fizz”. For numbers which
are multiples of both three and five print “ buzzfizz “. After program
looping is completed print how many times buzz was printed, fizz
was printed and buzzfizz was printed.*/


public class FizzBuzz {
	
	public void fizzBuzz(int lastVal) {
		for(int i=1;i<=lastVal;i++) {
			System.out.println(i%15==0?"buzzfizz":i%3==0?"buzz":i%5==0?"fizz":i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		FizzBuzz obj = new FizzBuzz();
		System.out.println("Enter the highest limit for fizzbuzz: ");
		int highest = Scan.nextInt();
		
		obj.fizzBuzz(highest);
		

	}

}
