package payroll;

public class CEO extends Employee{
    
    public CEO() {
        payGrade = 7;
        stockOptions = false;
    }
    
    public CEO(String _name, float _salary, boolean _stockOptions, int _shares) {
        payGrade = 7;
        name = _name;
        salary = _salary;
        stockOptions = _stockOptions;
        shares = _shares;
    }
    
    @Override
    public void setPayGrade(int g) {
        // do nothing; payGrade still equals 7
    }
    
}
