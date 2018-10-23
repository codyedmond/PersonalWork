package Loops;
import java.util.Scanner;
public class SumOfPositiveMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int count=0;
		int sum=0;
		 count=input.nextInt();
int stop=input.nextInt();
		while(count<=stop)
		{
		System.out.println(count);
		sum+=count;
		count+=2;
		}
		System.out.println("sum=" + sum);
			}

	{
	}

}
