package payroll;

public class Employee extends Person{
    
    protected float salary;
    protected int payGrade;
    protected boolean stockOptions;
    
    public Employee() {
        
    }
    
    public Employee(String _name, float _salary, int _payGrade, boolean _stockOptions, int _shares) {
        name = _name;
        salary = _salary;
        if(payGrade >= 0 && payGrade < 7)
            payGrade = _payGrade;
        else
            payGrade = 0;
        stockOptions = _stockOptions;
        shares = _shares;
        if(stockOptions)
            shares += 100;
    }
    
    public void setSalary(float s) {
        salary = s;
    }
    
    public void setPayGrade(int g) {
        if(g >= 0 && g < 7) 
            payGrade = g;
    }
    
    public void setStockOptions(boolean s) {
        stockOptions = s;
    }
    
    public float getSalary() {
        return salary;
    }
    
    public int getPayGrade() {
        return payGrade;
    }
    
    public boolean getStockOptions() {
        return stockOptions;
    }
    
    @Override
    public void setShares(int s) {
        super.setShares(s);
        if(stockOptions)
            shares += 100;
    }
    
    public float getEffectiveSalary(float yearlyProfit, long totalShares) {
        return salary + payGrade*1000f + yearlyProfit*(float)shares/(float)totalShares;
    }
    
    public String getInfo(float yearlyProfit, long totalShares) {
        return "Salary: " + Float.toString(salary) +
                "\nEffective Salary: " + Float.toString(getEffectiveSalary(yearlyProfit, totalShares)) +
                "\nPay Grade: " + Integer.toString(payGrade) +
                "\nStock Options: " + Boolean.toString(stockOptions) +
                "\nShares: " + Integer.toString(shares);
    }
    
}
