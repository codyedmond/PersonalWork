package decisions;

import java.util.Scanner;

public class LargestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Choose 3 integers");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		if (third > first && third > second) {
			System.out.println("The largest integer is" + (third));
		}
		if (second > first && second > third) {
			System.out.println("The largest integer is" + (second));
		}
		if (first > second && first > third) {
			System.out.println("The largest integer is:" + (first));
		}
	}

}
