package objectorientedprogram;

public class Circle {
private double radius;
public Circle(){
radius=0;
}
public Circle(double radius)
{
if( radius<=0)
{
radius = 10;
}
}
public double getRadius(){
	return radius;
}
public double getCircumference(){
return radius*2*3.14;
}
public double getArea(){
	return (radius*radius)*3.14;
}
public void changeRadius(double newRadius){
radius=newRadius;
}}
