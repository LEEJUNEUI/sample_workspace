package co.edu.interfaces;

public class Flymain {
	public static void main(String[] args) {
		
		Flyer flier = new Helicopter(); // Flyer <= Helicopter
		flier = new Airplane(); // Flyer <= Airplane
		
		flier.takeOff();
		flier.fly();
		flier.land();
		
	}
}
