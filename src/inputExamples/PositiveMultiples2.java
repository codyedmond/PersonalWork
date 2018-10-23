package inputExamples;
import java.util.Scanner;
public class PositiveMultiples2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int count=0;
System.out.println("What is the number");
int end=input.nextInt();
while(count<=end)
{
	System.out.println(count);
	count= count+2;
}
	}

}
