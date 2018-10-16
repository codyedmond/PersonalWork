package decisions;

public class ShoeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
System.out.println( "What is your height");
double height=input.nextInt();
System.out.println("What is your shoe size");
int shoesize=input.nextInt();
System.out.println(shoesize + height >= 26);
	}

}
