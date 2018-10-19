package decisions;

import java.util.Scanner;

public class FamilyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you");
		System.out.println("How much do you weigh");
		System.out.println("Do you smoke?");
		int age = input.nextInt();
		int weight = input.nextInt();
		boolean smoke = input.nextBoolean();

		if (age > 75) {
			System.out.println("Pay an extra $125");

		} 
		if (age < 30) {
			System.out.println("You get a $25 discount");

		} 
		if (weight > 700) {
			System.out.println("Pay an extra $300");

		}if (smoke == true) {
			System.out.println("Pay an extra $50");

		}
		else
			if (smoke == false) 
			{
			System.out.println("You get a $40 discount");
		}
	}
}
