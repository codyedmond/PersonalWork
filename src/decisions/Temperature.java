package decisions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("What is the appropriate activity with the temperature outside");
int tennistemp=input.nextInt();
int swimtemp=input.nextInt();
int golftemp=input.nextInt();
int snowshoetemp=input.nextInt();
int nothingtemp=input.nextInt();
if(swimtemp>83)
{
System.out.println("It is good weather for swimming");
}
else
if(tennistemp>74 && tennistemp<83)
{
System.out.println("It is a good weather for tennis");
}
else
if(golftemp>35 &&  golftemp<=74)
{
System.out.println("It is good weather for golf");
}
else
if(snowshoetemp>-10 && snowshoetemp<=35)
{
System.out.println("It is good weather for snowshoeing");
}
else
if(nothingtemp <=-10)
{
System.out.println("It is a good day to do nothing");
}
	}
}
