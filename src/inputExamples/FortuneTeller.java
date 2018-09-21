package inputExamples;
import java.util.Scanner;

import com.sun.corba.se.impl.orbutil.closure.Future;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int weight = 180;
int age = 17;
int lucky = 43;
Scanner input = new Scanner(System.in);
System.out.println("Enter your weight");
weight = input.nextInt();
System.out.println("You are" + weight + " pounds");
System.out.println("Enter your age");
age = input.nextInt();
System.out.println(" You are" + age+ " years olds");
System.out.println("Enter your lucky number");
lucky = input.nextInt();
System.out.println("Your lucky number is" + "lucky");
System.out.println("In the Future...");
System.out.println("I see...");
System.out.println(lucky + "years from now");
System.out.println("You will be reside number " + age  + weight);
System.out.println("at the old folks home");
	}

}
