package decisions;
import java.util.Scanner;
public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	double	testaverage= -999.9;
	double	homeworkaverage= -999.9;
		System.out.println("What is your test average?");
		System.out.println("What is your homework average?");
		System.out.println("Is the teacher nice?");
	 testaverage=input.nextDouble();
 homeworkaverage=input.nextDouble();
int answer= input.nextInt();

	if( answer==true)
	{
if(homeworkaverage>testaverage)
{
System.out.println("Homework affects your grade more");
}
	}
}
}