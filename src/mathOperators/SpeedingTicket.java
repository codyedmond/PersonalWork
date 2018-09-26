package mathOperators;
import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int speedlimit = -999;
int driverspeed = -999;
int cost = -999;
int initial  = 55;
int extra = 40;
int milesover=-999;
Scanner input= new Scanner(System.in);
System.out.println("What is the speed limit?");
speedlimit=input.nextInt();
System.out.println("What was your speed?");
driverspeed=input.nextInt();
System.out.println("How many miles over the speedlimit did you go?");
System.out.println("Your fine is" + cost);
cost= initial + extra * (milesover -1);
	}

}
