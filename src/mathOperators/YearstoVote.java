package mathOperators;
import java.util.Scanner;
public class YearstoVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 16;
Scanner input = new Scanner(System.in);
System.out.println("How old are you");
age= input.nextInt();
age = 18 - age;
System.out.println("There are " + age + "years until you can vote");
	}

}
