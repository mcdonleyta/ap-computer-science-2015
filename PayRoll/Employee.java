package PayRoll;

public class Employee extends Person{
private int PayGrade;
private double Salary;
private double StockAmount;
private boolean PayedInShares;

public Employee(int PayG, double Sal, double Stock, String Called, boolean Shares)
{
	PayGrade = PayG;
	Salary = Sal;
	StockAmount = Stock;
	PayedInShares = Shares;
	setName(Called);
}
public double getEmployeeSalary()
{
	return Salary;
}
public String getEmployeeName()
{
	return getName();
}
public double getStock()
{
	return StockAmount;
}
}
