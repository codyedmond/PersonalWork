package Loops;
import java.util.Scanner;
public class ActivityNew8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
double num=0.0;
double sum=0.0;
int inputs=0;
System.out.println("Please enter a number(9999 to quit)");
 num=input.nextDouble();
while (num != 9999)
{
	sum+=num;
System.out.println("Please enter a number(9999 to quit)");
num=input.nextDouble();
inputs++;
}
System.out.println("The average of the double values is:" + sum/inputs);
	}

}
