package CipherContents;

public class Encoder{
	public String[] AlphabetArray;
	public String[] CipherArray;
	public Encoder(){
}
	public String Encode(String input){
		boolean check = false;
		int PlaceMarker = 0;
		String DecodedString = "";
		String AlphabetString;
		String[] AlphabetArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		String[] CipherArrray = {"!","@","#","$","%","^","&","*","(",")","_","-","+","=","{","}","[","]",";",":","'","<",">",".","?","|"," "};
		while(check==false)
		{	
			AlphabetString = AlphabetArray[PlaceMarker];
			if(input == AlphabetString)
			{
				DecodedString = CipherArray[PlaceMarker];
			}
			else
			{
				PlaceMarker++;
			}
		}
		return DecodedString;
	}
}
