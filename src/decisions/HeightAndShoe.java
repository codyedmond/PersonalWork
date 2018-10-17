package decisions;
import java.util.Scanner;
public class HeightAndShoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("What is your shoe size?");
System.out.println("What is your height?");
int shoesize= input.nextInt();
double height =input.nextInt();
System.out.println(shoesize > 9);
System.out.println(height < 62);
	}

}
