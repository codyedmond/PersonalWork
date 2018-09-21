package mathOperators;
import java.util.Scanner;
public class AgeofFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int friend1 = 16;
int friend2 = 17;
int friend3 = 18;
int total = -999;
Scanner input= new Scanner(System.in);
System.out.println("What is the age of your first friend");
friend1= input.nextInt();
System.out.println("What is the age of your second friend");
friend2=input.nextInt();
System.out.println("What is the age of your third friend");
friend3=input.nextInt();
total= friend1 + friend2 + friend3;
System.out.println(" The total of your friends age is" + total);
	}

}
