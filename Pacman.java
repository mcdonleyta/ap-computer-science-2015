import pacman.*;

public class Pacman
{
	public static void main(String[] args)
	{
		Entity myEntity = new Entity();
		
		myEntity.setDisplayEntity('@');
		
		System.out.println(myEntity.getDisplayEntity());
	}
}
