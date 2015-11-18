package Payroll;
public class Person {
	private String name;
	private int shares = 1;
	
	public Person() {
	name = "";
	}
	public void setName(String newName) {
		newName = name;
	}
	public String getName() {
		return name;
	}
	public int getShares() {
		return shares;
	}
	public void setShares(int newShares) {
		newShares = shares;
	}
	public Person(String inputName) {
		name = inputName;
	}
	
	
}
