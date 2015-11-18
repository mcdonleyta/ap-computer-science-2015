package payroll;

import java.util.List;
import java.util.ArrayList;

public class Payroll {
    
    public List<Employee> employees;
    public CEO ceo;
    public float yearlyProfit;
    public long totalShares;
    
    
    public Payroll(String CEOName, float CEOSalary, boolean CEOStockOptions, int CEOShares, float _yearlyProfit, long _totalShares) {
        ceo = new CEO(CEOName, CEOSalary, CEOStockOptions, CEOShares);
        yearlyProfit = _yearlyProfit;
        totalShares = _totalShares;
        employees = new ArrayList<>();
    }
    
    public void addEmployee(String name, float salary, int payGrade, boolean stockOptions, int shares) {
        employees.add(new Employee(name, salary, payGrade, stockOptions, shares));
    }
    
    //returns index of last employee with matching name, or -2 if name of ceo (-1 if no matching name)
    public int findEmployee(String name) {
        int ret = -1;
        for(int a = 0; a < employees.size(); a++)
            if(employees.get(a).getName().equals(name))
                ret = a;
        if(name.equals(ceo.getName()))
            ret = -2;
        return ret;
    }
}

