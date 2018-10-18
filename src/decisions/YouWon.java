package decisions;
import java.util.Scanner;
public class YouWon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What is the amount of money you recieved for your fifth birthday");
double money= input.nextDouble();
double num=Math.sqrt(84.3);

if(Math.abs(money-num) <=.01)
{
System.out.println("You have a good prize");
}
else
{
	System.out.println("You have a bad prize");
}
}
}