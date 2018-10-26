package Loops;

import java.util.Scanner;

public class ForLoopsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int counter=0;
		int sum=input.nextInt();
		int number=input.nextInt();
		
		for(counter=1; counter<= 5; counter++)
		{
			sum+= sum + number;
			System.out.println("Give five numbers");
			System.out.println(sum);
		}}
	}


