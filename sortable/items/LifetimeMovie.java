package items;

public class LifetimeMovie extends Movie {

	private String name;
	private String subject;
	private double cheesiness;

	public String getName() { return name; }
	public String getSubject() { return subject; }
	public double getCheesiness() { return cheesiness; }

	public LifetimeMovie(double value, String _name, String _subject, double _cheesiness) {
		super(value);
		name = _name;
		subject = _subject;
		cheesiness = _cheesiness;
	}

}
