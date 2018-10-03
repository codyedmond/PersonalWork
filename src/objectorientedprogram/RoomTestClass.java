package objectorientedprogram;

public class RoomTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Room area = new Room();
Room closet= new Room();
Room kitchen= new Room();
Room basement= new Room();
kitchen=closet;
closet=basement;
closet.sayArea();
area.sayArea();
area.AreaWithDoor();
	}

}
