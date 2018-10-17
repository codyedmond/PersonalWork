package decisions;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What are the two test scores?");
int first=input.nextInt();
int second=input.nextInt();
if( first > second)
{
System.out.println("Good Job for entering the score in the correct order!");
System.out.println("The difference is:" + (first-second));
	}
System.out.println("That is not the correct order");
}
}
