package Loops;
import java.util.Scanner;
public class DoWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("Enter two numbers");
int numbers=input.nextInt();
int largest=numbers;
do{
	if(numbers> largest)
		largest=numbers;
System.out.println("Enter a number(9999 to quit):");
int number=input.nextInt();
}while(numbers !=9999);
	System.out.println(largest);


	}

}
