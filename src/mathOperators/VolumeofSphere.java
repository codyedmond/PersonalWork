package mathOperators;
import java.util.Scanner;
public class VolumeofSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double radius = -999.9;
double volume = -999.9;
Scanner input= new Scanner(System.in);
System.out.println("What is the radius for a sphere?");
radius=input.nextDouble();
volume = (4.0/3.0) * Math.PI * (radius * radius * radius);
System.out.println(" The volume of a sphere is" + volume);
	}

}
