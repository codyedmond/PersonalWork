package objectorientedprogram;

public class NumbersTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Numbers bob= new Numbers();
bob.sayNumber(7.5);
Numbers stacy= new Numbers();
stacy.sayNumberPlus2(7.5);
Numbers jennifer= new Numbers();
jennifer.saySum( 2,2);
Numbers don = new Numbers();
don.returnSquare(7.0);
double answer =bob.returnArea(5.0,4.0);
System.out.println(answer);

	}

}
