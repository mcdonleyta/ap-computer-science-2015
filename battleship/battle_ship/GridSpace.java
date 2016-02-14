package battle_ship;
public class GridSpace {
	public boolean isOccupied = false;
	protected Boat type;
	
	public GridSpace(Boat type_i) {
		type=type_i;
		isOccupied = true;
	}
	public GridSpace() {
		type = null;
		
	}
	public Boat getType() {
		return type;
	}
	public void setType(Boat type_i) {
		type = type_i;
		
	}
}
