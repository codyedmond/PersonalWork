package Loops;
import java.util.Scanner;
public class PositiveMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
int count=2;
 count=input.nextInt();

while(count<=100000)
{
System.out.println(count);
count= count +2;
}
	}

}
