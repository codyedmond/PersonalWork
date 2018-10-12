package objectorientedprogram;

public class IsoscelesTrapezoid {
	private double base1;
	private double base2;
	private double height;
	private double leg;

	public IsoscelesTrapezoid() {
		base1 = 7;
		base2 = 8;
		height = 10;
		leg = (Math.hypot(height, 2.5));
	}

	public IsoscelesTrapezoid(double base1, double base2, double height, double leg) {
	}

	public double perimeter() {
		return (base1 + base2 + leg);
	}

public double area(){
return (base1+ base2)*height/2;
}
}