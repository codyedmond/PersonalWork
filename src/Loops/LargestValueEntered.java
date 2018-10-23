package Loops;

import java.util.Scanner;

public class LargestValueEntered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		double num=0.0;
		double largest=-999;
		int inputs=0;
		System.out.println("Please enter a number(9999 to quit)");
		 num=input.nextDouble();
		while (num != 9999)
		{
			
		System.out.println("Please enter a number(9999 to quit)");
		System.out.println("The largest double value is:" + largest);
		num=input.nextDouble();
		inputs++;
		}
		
			}

	{
	}

}
