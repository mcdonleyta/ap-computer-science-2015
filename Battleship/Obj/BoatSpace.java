package Obj;

public class BoatSpace extends GridSpace {

	public Boolean hit() {
		super.hit();
		super.setIcon('!');
		return false;
	}
	public Boolean isBoat() {return true;}

	public BoatSpace(int _x, int _y) {
		super(_x, _y);
	}

	public BoatSpace() {
		super();
	}

}
