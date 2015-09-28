package pacman;

public class Entity {
	
	private char myDisplayEntity;

	public Boolean active = true;

	public void setDisplayEntity(int ascii) {
		myDisplayEntity = (char) ascii;
	}

	public char getDisplayEntity() {
		return myDisplayEntity;
	}

	public void setActive(Boolean input) {
		active = input;
	}

	public Boolean getActive() {
		return active;
	}

	Entity() {
		myDisplayEntity = '.';
	}

}