package Library;
import items.*;

public class Library {

	public static void main(String[] args) {

		Movie movie1 = new Drama(97, "Mad Max: Fury Road", "George Miller", 120);
		Movie movie2 = new Drama(32, "The Revenant", "Alejandro G. Inarritu", 156);
		int BetterMovie =  movie1.getBetter(movie2);
		Movie bestMovie = new Drama();
		if(BetterMovie == 1)
			bestMovie = movie1;
		else if(BetterMovie == -1)
			bestMovie = movie2;
		if(BetterMovie == 1 || BetterMovie == -1) {
			System.out.println(((Drama)bestMovie).getDirector() + " Wins Best Director!");
			System.out.println(((Drama)bestMovie).getName() + " Wins Best Picture!");
		}
		else
			System.out.println("It is a tie!");
	}

}
