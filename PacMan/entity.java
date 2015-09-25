package PacMan;

public class entity //base class for everything that is
{
	private char myDisplayEntity; // what the entity will be shown to the user as
	private int staticEntity = 1;

	public void setDisplayEntity(char ASCII)
	{
		//eventually add checks and safety
		myDisplayEntity = ASCII;
	}

	public char getDisplayEntity()
	{
		return myDisplayEntity;
	}
	public void setStaticEntity(int on)
	{
		staticEntity = on;
	}
	public int getStaticEntity()
	{
		return staticEntity;
	}

	public entity()
	{
		setDisplayEntity('.'); //default diplay entity, just blank moveable space
		setStaticEntity(1); 
	}
	public entity(char wall) //static entity
	{
		setDisplayEntity(wall); //wall 
		setStaticEntity(0);
	}
}
