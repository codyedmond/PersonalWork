package objectorientedprogram;

public class Worker {
	private int hours;
	private double rate;

	public Worker() {
		hours = 6;
		rate = 15;
	}

	public Worker(int hours, double rate) {
	}

	public double getHours() {
		return hours;
	}

	public double getRate() {
return rate;
}
public double setHours(int newHours){
hours=newHours;
	
	public double setRate(double newRate){	
rate=newRate;
}
public double payCheck(){
return (hours*rate);
}
public void Raise (double newRaise)