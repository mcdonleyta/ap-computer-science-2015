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





package activity2;

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
		String response = "";
		statement = statement.trim();
		if(statement.length() == 0)
		{
			response = "Say something.";
		}
		else if (statement.indexOf("no") >= 0)
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
		else if(statement.contains("cat") || statement.contains("dog"))
		{
			response = "Tell me more about your pets. How do they help you seize the means of production?";
		}
		else if(statement.contains("McDonley"))
		{
			response = "He is a good teacher, but he would be great if he converted to Communism.";
		}
		else if(statement.contains("feel"))
		{
			response = "I feel like we should seize the means of production.";
		}
		else if(statement.contains("where"))
		{
			response = "Mother Russia";
		}
		else if(statement.contains("communism"))
		{
			response = "Communism is the best. Hail Marx!";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Would you tell that to Marx himself?";
		}
		else if (whichResponse == 2)
		{
			response = "Down with the bourgeoisie.";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if(whichResponse == 4)
		{
			response = "So how 'bout that Communism!";
		}
		else if(whichResponse == 5)
		{
			response = "Marx is love, Marx is life";
		}

		return response;
	}
}
