package mathOperators;
import java.util.Scanner;
public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double dollars = -999;
double quarters = 0.25;
double dimes = 0.10;
double nickels= 0.05;
double pennies = 0.01;
double change= 4.25;
double amount = 0.00;
Scanner input=new Scanner(System.in);
System.out.println("What amount change do you need");
amount= input.nextInt();
System.out.println(" How many dollars do you have?");
dollars=input.nextInt();
System.out.println(" How many quarters do you have?");
quarters=input.nextInt();
System.out.println(" How many nickels do you have?");
nickels=input.nextInt();
System.out.println(" How many pennies do you have?");
pennies=input.nextInt();
change= dollars + quarters + nickels + pennies;
System.out.println("Your change is" + dollars + quarters + dimes+ nickels + pennies);

	}

}
