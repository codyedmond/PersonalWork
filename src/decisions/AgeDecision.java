package decisions;
import java.util.Scanner;
public class AgeDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What is your age");
System.out.println("Hope you are having a great day");
int age = input.nextInt();
if(age>=17)
{
System.out.println("Youre getting an A in this class");
}
System.out.println("You are not getting an A in this Class");	
	}
}
