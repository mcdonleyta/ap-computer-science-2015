import items.*;

//Mr. M: Your coding conventions and style are very good. I like your use of the super(...). 
//       I'd like to see you finish this lab to get full credit. 

public class Sortable {

	public static void main(String[] args) {
		Movie movie1 = new Drama(97, "Mad Max: Fury Road", "George Miller", 120);
		Movie movie2 = new Drama(32, "The Revenant", "Alejandro G. Inarritu", 156);
		Movie movie3 = new LifetimeMovie(2, "I'm Too Fat!", "Obesity", 345.924);
		Sort sortedList = new Sort();
		sortedList.add(movie1);
		sortedList.add(movie3);
		sortedList.add(movie2);
		sortedList.printAll();
		Movie movie4 = new Documentary(73, "How to Piano Good", "Piano", 182);
		sortedList.add(movie4);
		sortedList.printAll();
	}

}
