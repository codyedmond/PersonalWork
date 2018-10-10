package objectorientedprogram;

public class RectangleTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle bob= new Rectangle();
System.out.println(bob.getLength());
System.out.println(bob.getWidth());
bob.changeLength(5);
bob.changeWidth(9);
System.out.println(bob.getArea());
System.out.println(bob.getPerimeter());
	}

}
