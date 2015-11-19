package PayRoll;
import PayRoll.*;
import java.util.*;

public class PayRollMain{
public ArrayList<Employee> EmployeeList = new ArrayList<Employee>();

public void addEmployee(Employee In)
{
	EmployeeList.add(In);
}
public double getSalary(String Name)
{
	double Salary = 0;
	for(Employee e: EmployeeList)
	{
		if(Name == e.getEmployeeName())
		{
			Salary = e.getEmployeeSalary();
		}
	}
	return Salary;
}
}
