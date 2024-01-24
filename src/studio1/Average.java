package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first integer to be averaged?");
		int int1 = in.nextInt();
		double n1 = int1;
		System.out.println("The second integer to be averaged?");
		int int2 = in.nextInt();
		double n2 = int2;
		double avg = (n1 + n2) / 2 ;
		System.out.println("The average of "+int1+" and "+int2+" is "+avg+".");

	}

}
