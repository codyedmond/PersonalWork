package decisions;
import java.util.Scanner;
public class PetsAndGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int pets = -999;
int cars= -999;
System.out.println("How many cats are in your house and how many cars can fit in your garage?");
cars= input.nextInt();
pets= input.nextInt();
System.out.println(pets <= 5 ||  cars >= 3);
	}
}
