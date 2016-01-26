package Library;
import items.*;

public class Sort {

	private List<Movie> MovieList;
	
	public void add(Movie m) { MovieList.add(m); }
	public void add(Movie m, int i) { MovieList.add(m, i);
	public int getSize() { return MovieList.size(); }
	public Movie get(int i) { return MovieList.get(i); }
	public void printAll() {
		int i = 0;
		for(Movie m: MovieList) {
			System.out.println(i + m.getRating());
			i++;
		}
	}

	public void sortList() {
		for(Movie m: MovieList	
	}

	public class Sort() {
		MovieList = new ArrayList(0);
	}

}
