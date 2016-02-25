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


	//the trim method, checks whether someone inputted something or not
	public int trim(String statement) 
	{
		if(statement.equals("") || statement.equals(" "))
		{
			return 0;
		}else
		{
			return 1;
		}
	}

	public String getResponse(String statement)
	{
		String response = "";
		int b;
		b = trim(statement);

		if(b == 0)
		{
			response = "Say something, please";
		}else
		if(b == 1)
		{
			if (statement.indexOf("no") >= 0)
			{
				response = "Why so negative?";
			}
			else 
			if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0)
			{
				response = "Tell me more about your family.";
			}
			else 
			if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0 || statement.indexOf("fish") >= 0 || statement.indexOf("snake") >= 0)
			{
				response = "Tell me more about your pets.";
			}else 
			if(statement.indexOf("Mr. McDonley") >= 0) 
			{
				response = "Your teacher seems to be very helpful.";
			}else
			if (statement.indexOf("cousin") >= 0) 
			{
				response = "How is your cousin?";
			}else
			if(statement.indexOf("school") >= 0)
			{
				response = "Tell me about school, Village Academy.";
			}else
			if(statement.indexOf("book") >=0 || statement.indexOf("books") >= 0)
			{
				response = "What books do you like to read?";
			}else
			if(statement.indexOf("ok") >= 0)
			{
				response = "Tell me something.";
			}else
			{
				response = getRandomResponse();
			}
		}

		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
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
		else if(whichResponse == 4)
		{
			response = "Cool";
		}else if(whichResponse == 5) 
		{
			response = "That’s so right up your alley.";
		}else if(whichResponse == 6)
		{
			response = "You know, not everyone can pull that off.";
		}

		return response;
	}
}
