package Loops;
import java.util.Scanner;
public class Acitivity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner input= new Scanner(System.in);
int num=0;
System.out.println("Please enter a number(9999 to quit)");
 num=input.nextInt();
while (num != 9999)
{
System.out.println("Your numbers times two is" + num*2);
System.out.println("Please enter a number(9999 to quit)");
num=input.nextInt();

}
	}

}*/
Scanner input= new Scanner(System.in);

int num=0;
int sum=0;
System.out.println("Please enter a number(9999 to quit)");
 num=input.nextInt();
while (num != 9999)
{
	sum=sum + num;
System.out.println("Your numbers times two is" + num*2);
System.out.println("Please enter a number(9999 to quit)");
num=input.nextInt();
}
}
}