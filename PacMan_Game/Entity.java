package PacMan_Game;

public class Entity{
	 
	private char myDisplayEntity;
	private String myCharacterEntity;


		public Entity()
		{
			myDisplayEntity = '.';
			myCharacterEntity = "C";
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
		public String getCharacterEntity()
		{
			return myCharacterEntity;
		}
}
