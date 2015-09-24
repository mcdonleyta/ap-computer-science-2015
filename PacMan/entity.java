package PacMan;

public class entity
{
	private char myDisplayEntity;

	public void setDisplayEntity(char ASCII)
	{
		//eventually add checks and safety
		myDisplayEntity = ASCII;
	}

	public char getDisplayEntity()
	{
		return myDisplayEntity;
	}

	public entity()
	{
		setDisplayEntity('.');
	}
}
