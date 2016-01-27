package items;

public class Drama extends Movie {

	private String name;
	private String director;
	private int runtime;

	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}

	public int getRuntime() {
		return runtime;
	}

	public int getBetter(String s) {
		return name.compareTo(s);
	}

	public Drama(double value, String _name, String _director, int _runtime) {
		super(value);
		name = _name;
		director = _director;
		runtime = _runtime;
	}

	public Drama() {
		super(0);
		name = null;
		director = null;
		runtime = 0;
	}

}
