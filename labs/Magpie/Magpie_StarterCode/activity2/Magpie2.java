/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
<<<<<<< HEAD
		statement = statement.trim();
		String response = "";
		if(statement.length() <= 0) { // made more sense here
			response = "Speak up!";
		}
		else if (statement.indexOf("no") >= 0)
=======
		String response = "";
		if (statement.indexOf("no") >= 0)
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
<<<<<<< HEAD
		else if (statement.indexOf("cat") >=0 || statement.indexOf("dog") >= 0) { 
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr.M") >= 0) {
			response = "He sounds like a good teacher.";
		}
		else if (statement.indexOf("square brackets") >= 0) {
			response = "should be on the same line, peasant.";
		}
		else if (statement.indexOf("batman")>=0) {
			response = "I'm not saying I'm Batman, just that no one's ever seen us in the same room.";
		}
		else if (statement.indexOf("hello") >=0) {
			response = "hi";
		}	
=======
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
<<<<<<< HEAD
	/* LAST BULLET POINT :What happens when more than one keyword appears in a string? Consider the string “My
	 * mother has a dog but no cat.” Explain how to prioritize responses in the reply method.
	 * 
	 * If there are more than one, the first response tested is displayed.
	 * You can prioritize responses by moving them up in the else-if block. 
	 * /
=======
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
<<<<<<< HEAD
		final int NUMBER_OF_RESPONSES = 6;
=======
		final int NUMBER_OF_RESPONSES = 4;
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
<<<<<<< HEAD
		else if (whichResponse == 4) {
			response = "Really?";
		}
		else if (whichResponse == 5) {
			response = "Cool story bro";
		}
=======
>>>>>>> 373aa96cdb39d0c13a722815cbab04a0be093eba

		return response;
	}
}
