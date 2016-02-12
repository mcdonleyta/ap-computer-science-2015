package Obj;

public class Boat {

	private List<BoatSpace> spaces;
	private Boolean isSunk;

	public Boolean hit(int x, int y) {
		for(BoatSpace b: spaces) {
			if(b.get	
