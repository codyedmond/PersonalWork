package decisions;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int money = -999;
		System.out.println("How much money do you have in a year?");
		money = input.nextInt();

		if (money <= 20000) {
			System.out.println("You are a worker");
		} else {
			if (money <= 40000) {
				System.out.println("You are in management");
			} else {
				if (money > 40000 || money <= 100000) {
					System.out.println("You are a Ceo");
				} else {
					if (money > 100000) {
						System.out.println("You are the owner");
					}
				}
			}
		}
	}
}