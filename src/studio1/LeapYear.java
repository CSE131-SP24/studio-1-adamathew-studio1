package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year:");
		int yr = in.nextInt();
		boolean div4 = (yr % 4 == 0);
		boolean div100 = (yr % 100 != 0);
		boolean div400 = (yr % 400 == 0);
		boolean leap = div4 && div100 || div400 ;
		
		System.out.print(yr+" is a leap year: "+leap);

	}

}
