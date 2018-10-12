package objectorientedprogram;

public class RightTriangle {
private double base;
private double height;
public RightTriangle(){
	base = 5;
	height= 6;
}
public RightTriangle( double base, double height){
}
public double hypot(){
return Math.hypot(base, height);
}
public double perimeter(){
return ( base + base + height + height);
}
public double area(){
return ( base *height)/2;
}
}

