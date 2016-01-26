package Library;
import java.util.Scanner;

public class Driver {

	private Sort list;

	public void populateList() {
		Scanner input = new Scanner(System.in);
		Boolean cont = false;
		Movie newMovie;
		while(cont != true) {
			System.out.println("What type of Movie is this:\n 1. Drama\n 2. Documentary\n 3. Lifetime Movie");
			switch (input.nextInt()) {
				case 1:
					System.out.println("What is the title of your drama?");
					String title = input.nextLine();
					System.out.println("Who directed your drama?");
					String director = input.nextLine();
					System.out.println("How long is your drama?");
					int runtime = input.nextInt();
					System.out.println("What is the rating of your drama?");
					double rating = input.nextDouble();
					newMovie = new Drama(rating, title, director, runtime);
					break;

				case 2:
					System.out.println("What is the title of your documentary?");
					String title = input.nextLine();
					System.out.println("What is the subject of your documentary?");
					String subject = input.nextLine();
					System.out.println("How long is your documentary?");
					int runtime = input.nextInt();
					System.out.println("What is the rating of your documentary?"):
					double rating = input.nextDouble();
					newMovie = new Documentary(rating, title, subject, runtime);
					break;
				
				case 3:
					System.out.println("What is the title of your Lifetime Movie?");
					String title = input.nextLine();
					System.out.println("What is the subject of your Lifetime Movie?");
					String subject = input.nextLine();
					System.out.println("How cheesy is your Lifetime Movie?(As a double)");
					double cheesiness = input.nextDouble();
					System.out.println("What is the rating of your Lifetime Movie?");
					double rating = input.nextDouble();
					newMovie = new LifetimeMovie(rating, title, subject, cheesiness);
					break;

				default:
					System.out.println("Ya dun messed up");
					break;

			}
			list.add(newMovie);
			System.out.println("Do you want to add another movie?\n 1. Yes\n 2. Yes");
			cont = input.nextBoolean();
		}

		

	}

	
