package mathOperators;
import java.util.Scanner;
public class SocialSecurityNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age= 15;
int ssn = -999;
int finalfour = -999;
Scanner input = new Scanner(System.in);
System.out.println("How old are you?");
age=input.nextInt();
System.out.println("What is your social security number");
ssn=input.nextInt();
System.out.println("What are the final four digits of your social security number");
finalfour=input.nextInt();
age = 18 - age;
System.out.println("You are" + age + " years from 18" + " your ssn is" + ssn);
System.out.println("The final four digits of your ssn are" + finalfour);
input.close();
	}

}
