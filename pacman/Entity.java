package pacman;

public class Entity
{

		private char myDisplayEntity;
		
		public void setDisplayEntity(char ascii)
		{
			//Eventually add checks and safety stuff
			myDisplayEntity = ascii;
		}
		
		public char getDisplayEntity()
		{
			return myDisplayEntity;
		}
}
