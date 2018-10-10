package objectorientedprogram;

public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	private double area;

	public Rectangle(double length, double width) {
		length = 6;
		width = 5;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getPerimeter() {
		return (length + length + width + width);
	}

	public double getArea() {
		return (length * width);
	}

	public void changeLength(double newLength) {
		length = newLength;
	}

	public void changeWidth(double newWidth) {
		width = newWidth;
	}
}
