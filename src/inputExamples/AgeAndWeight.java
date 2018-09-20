package inputExamples;
import java.util.Scanner;
public class AgeAndWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 16;
int weight = 185;
Scanner input = new Scanner(System.in);
System.out.println("How old are you");
System.out.println("How much do you weigh");
age = input.nextInt();
weight = input.nextInt();
System.out.println("I weigh" + weight + "pounds");
System.out.println("I am" + age + " years old");
	}

}
