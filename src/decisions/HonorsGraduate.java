package decisions;

import java.util.Scanner;

public class HonorsGraduate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your gpa"); 
System.out.println("What is your age");
double gpa= input.nextDouble();
int age= input.nextInt();
 if(gpa>=3.5&&age>=18)

	{
		System.out.println("You can graduate with honors");
	}
 else
	{
		System.out.println("You can not graduate with honors");
	}
}
}