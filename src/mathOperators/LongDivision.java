package mathOperators;
import java.util.Scanner;
public final class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dividend = 13;
int divisor = 3;
int result = -999;
int remainder = -999;
Scanner input= new Scanner(System.in);
System.out.println("What is the dividend?");
dividend=input.nextInt();
System.out.println("What is the divisor");
divisor=input.nextInt();
result= dividend / divisor;
remainder = dividend % divisor;
System.out.println("Your answer is" + result + remainder );
	}

}
