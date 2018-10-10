package objectorientedprogram;

public class Employee {
private double wage;
private double experience;
public Employee()
{
}
{
wage = 7.75;
experience = 2;
}
public double getWage(){
	return wage;
}
public double setWage(double newWage){
	wage=newWage;
}
public double getExperience(){
	return experience;
}
public double setExperience(double newExperience)
{
	experience=newExperience;
			
}
public void giveRaise(){
	wage=wage*1.10;
}
}}

