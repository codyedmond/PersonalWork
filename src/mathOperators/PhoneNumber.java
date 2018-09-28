package mathOperators;
import java.util.Scanner;
public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int phonenumber= -999;
int areacode= -999;
int middledigits=-999;
int lastdigits = -999;
Scanner input = new Scanner(System.in);
System.out.println(" What is the area code of your phone number");
areacode = input.nextInt();
System.out.println( "What are the middle three digits of your phone number");
middledigits= input.nextInt();
System.out.println( "What are the last four digits of your phone number");
lastdigits=input.nextInt();
phonenumber= areacode + middledigits + lastdigits;
System.out.println(" Your phone number is" + areacode +"" + middledigits +"" + lastdigits);
input.close();
	}

}
