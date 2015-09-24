package PacMan_Game;

public class Entity{
	 
	private char myDisplayEntity;


		public Entity()
		{
			myDisplayEntity = '.';
		}
		public void setDisplayEntity(char ascii)
		{
			//Enventually add checks and safety
			myDisplayEntity = ascii;	
		}
		
		public char getDisplayEntity()
		{
			return myDisplayEntity;
		}
}
