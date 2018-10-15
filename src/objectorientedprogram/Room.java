package objectorientedprogram;
import java.util.Scanner;
public class Room {
public Room()
{}

public void sayArea()
	{
	double length = -999.0;
	double width = -999.9;
	double area= -999.0;
	Scanner input= new Scanner(System.in);
	System.out.println("What is the length of the wall");
	length=input.nextDouble();
	System.out.println("What is the width of the wall");
	width=input.nextDouble();
	area= width * length;
	System.out.println("The area is" + area );
	
	}

public void AreaWithDoor()
{
double length = -999.0;
double width = -999.9;
double area= -999.0;
double length2=-999.0;
double width2=-999.0;
double doorarea=-999.0;
double areanodoor=-999.9;
Scanner input= new Scanner(System.in);
System.out.println("What is the length of the wall");
length=input.nextDouble();
System.out.println("What is the width of the wall");
width=input.nextDouble();
area= width * length;
System.out.println("What is the length of the wall");
length2=input.nextDouble();
System.out.println("What is the width of the wall");
width2=input.nextDouble();
doorarea= width2 * length2;
areanodoor= doorarea - area;



}}
