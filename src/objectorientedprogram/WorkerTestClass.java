package objectorientedprogram;

public class WorkerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker bob = new Worker();
		System.out.println(bob.getHours());
		bob.setHours();
		System.out.println(bob.getRate());
		bob.newRate();
	}

}
