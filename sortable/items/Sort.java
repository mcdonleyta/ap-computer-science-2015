package items;
import java.util.*;

public class Sort {

	private List<Movie> MovieList;
	
	public void add(Movie m) {
		if(MovieList.size() == 0 || m.getBetter(MovieList.get(MovieList.size() - 1)) == 1 || m.getBetter(MovieList.get(MovieList.size() - 1)) == 0) {
			MovieList.add(m);
		}
		else if(m.getBetter(MovieList.get(0)) == -1) {
			MovieList.add(0, m);
		}
		else {
			Boolean done = false;
			int index = MovieList.size() / 2;
			while(done != true) {
				if(m.getBetter(MovieList.get(index - 1)) == 1 && m.getBetter(MovieList.get(index)) == - 1 || m.getBetter(MovieList.get(index)) == 0) {
					MovieList.add(index, m);
					done = true;
				}
				else if(m.getBetter(MovieList.get(index)) == 1) {
					index = index + ((MovieList.size() - index) / 2);
				}
				else if(m.getBetter(MovieList.get(index)) == -1) {
					index = index/2;
				}
			}
		}
	}
	public int getSize() { return MovieList.size(); }
	public Movie get(int i) { return MovieList.get(i); }
	public void printAll() {
		int i = 0;
		for(Movie m: MovieList) {
			System.out.println(m.getRating());
			i++;
		}
	}

	public Sort() {
		MovieList = new ArrayList(0);
	}

}
