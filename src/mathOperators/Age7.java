package mathOperators;
import java.util.Scanner;
public class Age7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 16;
Scanner input = new Scanner(System.in);
System.out.println("What is your age");
age= input.nextInt();
age = age + 7;
System.out.println("In seven years you will be" + age );
	}

}
