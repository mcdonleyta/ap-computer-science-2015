package payroll;

public class Person {
    
    protected String name;
    protected int shares;
    
    Person() {
        
    }
    
    Person(String _name, int _shares) {
        name = _name;
        if(_shares >= 0)
            shares = _shares;
        else
            shares = 0;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setShares(int s) {
        if(s >= 0)
            shares = s;
    }
    
    public int getShares() {
        return shares;
    }
}