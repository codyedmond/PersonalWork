package mathOperators;
import java.util.Scanner;
public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int height = 8;
int width = 7;
int area = 56;
Scanner input= new Scanner(System.in);
System.out.println(" How tall is the wall");
height= input.nextInt();
System.out.println("What is the wall width");
width = input.nextInt();
area = height * width;
System.out.println(" The walls area is" + height * width);


}}
