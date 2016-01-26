public class Documentary extends Movie {

	private String name;
	private String subject;
	private int runtime;

	public String getName() { return name; }
	public String getSubject() { return subject; }
	public int getRuntime() { return runtime; }

	public Movie (double value, String _name, String _subject, int _runtime) {
		super(value);
		name = _name;
		subject = _subject;
		runtime = _runtime;

	}

}
