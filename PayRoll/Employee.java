package PayRoll;

public class Employee extends Person{
private int PayGrade;
private double Salary;
private int StockAmount;
private boolean PayedInShares;

public Employee(int PayG, double Sal, int Stock, String Called, boolean Shares)
{
	PayGrade = PayG;
	Salary = Sal;
	StockAmount = Stock;
	PayedInShares = Shares;
	setName(Called);
}
public double getSalary()
{
	return Salary;
}
public String getName()
{
	return getName();
}
public int getStock()
{
	return StockAmount;
}
}
